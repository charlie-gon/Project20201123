
//201124
//인터페이스 연습문제_교재 387

package com.yedam.interfaces;

public class DaoExample {
	public static void dbWork(DataAccessobject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
