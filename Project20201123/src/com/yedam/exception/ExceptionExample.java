
//201126
//에외처리

package com.yedam.exception;

import java.sql.Connection;
import java.sql.SQLException;

import com.yedam.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
		int num = 10;
		
		//try ~ catch 구문을 통해 에러 발생을 막고 프로그램이 끝까지 실행되도록 한다
		try {
		int[] numbers = new int[3];
		numbers[3] = 10;
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		try {
		String str = null;
		System.out.println(str.toString());
		} catch(NullPointerException e) { //에러 처리된 부분을 예외처리하여 출력되도록 함
			System.out.println("출력값이 없습니다.");
		}
		
		Connection conn = DAO.getConnection();
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
