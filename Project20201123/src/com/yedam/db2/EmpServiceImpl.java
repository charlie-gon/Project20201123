
//201125

package com.yedam.db2;

import java.util.List;


public class EmpServiceImpl implements EmpService{ //구현클래스
	// EmpService클래스를 구현하겠음
	// 구조: public class 구현클래스명 implements 인터페이스명

	EmpDAO dao = new EmpDAO(); //EmpDAO가 가지고 있는 값을 호출하기 위한 인스턴스 생성
	
	
	@Override
	public List getEmpList() {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVO) {
		dao.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmployeeVO empVO) {
		dao.updateEmp(empVO);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	} //구현클래스 / EmpService를 구현하겠습니다.
	

}
