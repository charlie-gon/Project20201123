
//201125

package com.yedam.db2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpMain { // EmpService 호출
	public static void main(String[] args) {

		// Note) 인터페이스와 구현클래스 생성을 통해 인터페이스로 호출, 구현클래스로 데이터 끌어오는 방식 실습
		// NOte) 구현클래스만 수정하면 큰 틀은 유지한 채 데이터 수정을 자유로이 할 수 있음

		Scanner scn = new Scanner(System.in);

		// EmpServiceImpl값을 EmpService가 받아 값을 출력하도록 설정
		EmpService service = new EmpServiceImpl();

		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.전체조회 2.검색 3.입력 4.수정 5.삭제 6.종료 7.부서별조회");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpinfo();
				}

				// 한건조회
			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호 입력");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpinfo();

				// 한건입력
			} else if (selectNo == 3) {
				System.out.println("사원번호 입력하세요.");
				int empId = scn.nextInt();
				System.out.println("이름 입력하세요.");
				scn.nextLine();
				String lastName = scn.nextLine();
				System.out.println("성을 입력하세요.");
				String firstName = scn.nextLine();
				System.out.println("이메일 입력하세요.");
				String email = scn.nextLine();
				System.out.println("입사일 입력하세요.");
				String hireDate = scn.nextLine();

				EmployeeVO empVO = new EmployeeVO(empId, lastName, firstName, email, hireDate);
				EmpDAO dao = new EmpDAO();
				dao.insertEmp(empVO);

				// 한건수정
			} else if (selectNo == 4) {
				System.out.println("수정할 사원번호: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호: ");
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여");
				String salary = scn.nextLine();

				if (salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary); // 문자를 솟자로 바꾸어줌

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNum(phoneNum);
				vo.setSalary(sal);

				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();
				service.deleteEmp(empId);

			} else if (selectNo == 6) {
				break;

			} else if (selectNo == 7) {
				System.out.println("조회할 부서이름 입력:	");
				scn.nextLine();
				String deptName = scn.nextLine();

				List<EmployeeVO> list = service.getDeptList(deptName);
				for (EmployeeVO deptList : list) {
					EmployeeVO dept = (EmployeeVO) deptList;
					dept.showEmpinfo();
				}
			}

		}
		System.out.println("ㄲ");
		System.out.println("ㅡ");
		System.out.println("ㅌ");

	}// end of class

}// end of main
