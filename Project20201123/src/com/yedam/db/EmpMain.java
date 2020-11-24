
//201124

package com.yedam.db;

import java.util.Scanner;

public class EmpMain {
	
	static Scanner scn = new Scanner(System.in); //static선언하여 addEmployee 메소드 사용 및 필드 내 스캐너 기능 사용할 수 있도록 지정
	public static void main(String[] args) {

		

		// 사원정보, 부서정보
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.사원정보 2.부서정보 3.종료 4.사원입력");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt(); scn.hasNextLine();

			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpinfo();
					}
				}
			}else if(selectNo == 2) {
				DeptDAO dao = new DeptDAO();
				Dept[] departments = dao.getDeptList();
				for(Dept dep : departments) {
					if(dep != null) {
						dep.showDeptInfo();
					}
				}
				
			}else if(selectNo == 3) {
				break;
			}else if(selectNo == 4) {
				addEmployee();
				//employees 테이블은 제약조건이 많아 데이터값이 출력되지 않음. emp1이라는 테이블을 만들어서 진행할 것
			}
		}

		System.out.println("end of prog");
	}//end of main
	public static void addEmployee() {
		System.out.print("이름입력"); 
		String name = scn.nextLine(); scn.nextLine();
		System.out.print("입사일");
		String hireDate = scn.nextLine();
		
		Employee emp = new Employee(name,hireDate);
		EmpDAO dao = new EmpDAO();
		dao.insertEmployee(emp);
	}

}//end of class
