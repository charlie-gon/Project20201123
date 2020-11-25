package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = getConnection();
	
	public void insertEmployee(Employee emp) {
		String sql = "INSERT INTO dept80(last_name, hire_date)" + "VALUES(?,?)";
		//employees 테이블은 제약조건이 많아 데이터값이 출력되지 않음. emp2이라는 테이블로 진행할 것
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			//sql에 넣을 값 VALUES(?,?,?,?)에서 1,2,3,4번째 위치에 값을 넣겠다
			psmt.setString(1, emp.getLastName()); 
			psmt.setString(2, emp.getHireDate());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건이 입력됨");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Employee[] getEmpList() {

		String sql = "select * from employees";
		Employee[] emps = new Employee[100];
		try {

			PreparedStatement psmt = conn.prepareStatement(sql); //준비
			ResultSet rs = psmt.executeQuery(); //실행
			int i = 0;
			while (rs.next()) { // next는 한 건 가져오겠다는 의미 / 실행된 rs를 한 건 가져오겠음 /계속 반복하며 쿼리 결과값을 가져오겠다
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNum(rs.getNString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emps[i++] = emp;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}

	
	//sql연결문
	public static Connection getConnection() { // static이므로 인스턴스 없이 바로 실행 가능
		Connection conn = null;
		try {
			String user = "hr"; // hr로 수정
			String pw = "hr"; // hr로 수정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unknown error");
			e.printStackTrace();
		}
		return conn;
	}

}
