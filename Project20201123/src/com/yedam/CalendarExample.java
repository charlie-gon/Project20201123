
//201126
//연습

package com.yedam;

import java.util.Calendar;

public class CalendarExample {
	
	//main class
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(1970, 8, 1);
		
		
	
		

	}
	
	
	//method
	public static void getCal(int year, int month, int date) {
		System.out.println(year + " / " + month + " / " + date);
	
	}//end of class
	
	
	
	
//	//달력 만들기
//	//자바에 있는 캘린더 클래스 활용
//	
//	Calendar cal = Calendar.getInstance(); //캘린더 클랜스 선언은 일반적이지 않으니 숙지하도록
//	
///	cal.set(2020, 0, 1); //2020년 1월 1일
//	
//	cal.set(1970, 8, 1); //set값을 통해 해당 월의 첫번째 혹은 마지막 날의 날짜 및 요일을 파악할 수 있음
//	
//	System.out.println("Year " + cal.get(Calendar.YEAR));
//	System.out.println("Month " + cal.get(Calendar.MONTH)); //Calendar 클래스에서 1월은 0임 -1로 환산
//	System.out.println("DATE " + cal.get(Calendar.DATE));
//	System.out.println("DAY " + cal.get(Calendar.DAY_OF_MONTH));
//	
//	//5가 출력됨. 그 주의 5번째 날이라는 의미. 오늘은 그 주의 몇 번째 날인지 찾는데 용이
//	System.out.println("DAY " + cal.get(Calendar.DAY_OF_WEEK)); 
//	
//	//그 달의 마지막 날을 보고싶을 때는 getActualMaximum 사용
//	System.out.println("last day of the month " + cal.getActualMaximum(Calendar.DATE));
//
//	
	
}//end of main
