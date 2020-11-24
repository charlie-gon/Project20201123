
//201124

package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO {
	
		Connection conn = getConnection();

	public Dept[] getDeptList() {

		String sql = "select * from departments";
		Dept[] depts = new Dept[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Dept dep = new Dept();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				depts[i++] = dep;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return depts;

	}
	
	//sql 연결문
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


