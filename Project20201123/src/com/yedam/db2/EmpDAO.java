
//201125

package com.yedam.db2;

import com.yedam.common.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {

	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 데이터 처리를 위한 기능 삽입(전체조회, 한건조회, 한건입력, 한건수정, 한건삭제)

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp2 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}

	// 한건조회
	// 갓댐
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp2 where employee_id = ?";

		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {

				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}

	// 한건입력
	public void insertEmp(EmployeeVO empVO) {
		conn = DAO.getConnection();
		String sql = "INSERT INTO emp2(employee_id, last_name, first_name, email, hire_date)" + "VALUES(?,?,?,?,?)";
		//null값이 허용되지 않는 특정 컬럼을 사용할 때는 nvl을 활용하여 null값을 0으로 전환하거나, 아니면 DB를 수정하여 null값도 허용하도록 설정해야 한다.
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmployeeId());
			pstmt.setString(2, empVO.getLastName());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getEmail());
			pstmt.setString(5, empVO.getHireDate());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO empVO) {
if(empVO.getSalary() != 0) {
	sql = "update emp2\n" 
				+ " set email = nvl('" + empVO.getEmail() + "', email)" 
				+ " ,phone_number = nvl('" + empVO.getPhoneNum() + "', + phone_number)"
				+ ",salary = nvl('" + empVO.getSalary() + "', salary)"
				+ "where employee_id = '" + empVO.getEmployeeId() + "'";
}else {
	sql = "update emp2\n" 
			+ " set email = nvl('" + empVO.getEmail() + "', email)" 
			+ " ,phone_number = nvl('" + empVO.getPhoneNum() + "', phone_number)"
			+ ",salary = nvl('" + empVO.getSalary() + "', salary)"
			+ "where employee_id = '" + empVO.getEmployeeId() + "'";
}
System.out.println(sql);
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건삭제
	public void deleteEmp(int empId) {
		conn = DAO.getConnection(); //연결객체
		sql = "delete from emp2 where employee_id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); //sql 해석
			pstmt.setInt(1, empId); //쿼리에 값 세팅(1번 위치홀더(?)에 empId 값을 넣겠다)
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("성공적으로 삭제했습니다.");
			}else {
				System.out.println("삭제되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 부서 조회(제네릭 활용)
	public List<EmployeeVO> getDeptList(String dept){
		conn = DAO.getConnection();
		sql = "select * from emp3 where department_id = (select department_id from departments where department_name = ?)";
		List<EmployeeVO> deptList = new ArrayList<>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				deptList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deptList;
	}
	
	
	
	
}
