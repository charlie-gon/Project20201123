
//201126
//연습
//달력 출력

package com.yedam;

import java.util.Calendar;

public class CalendarPractice {
	public static void main(String[] args) {
		showCal(2020, 1);
	}

	public static void showCal(int year, int month) {
		System.out.println(year + "년" + " " + month + "월 달력");

		System.out.println("달" + "TO THE" + "력");

		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		for (int i = 0; i < day.length; i++) {
			System.out.printf("%4s", day[i]);

		}

		Calendar cal1 = Calendar.getInstance();
		cal1.set(year, month, 1);

		int date = cal1.get(Calendar.DATE);
		int lastDay = cal1.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 2번째인 월요일부터 시작하되 6번째인 토요일에는 데이터 넣은 뒤 줄바꿈 하도록 설정
		// 숫자 0을 보이지 않도록 만들어 요일을 밀어내는 방식으로 표현할 수 있지 않을까?
		for (int i = 0; i <= date; i++) {
			if (i == 0) {
				System.out.println();
			}
			System.out.printf("%5d", i);
		}
		for (int i = 2; i < lastDay; i++) {
			if (i % 7 == 0) {
				System.out.println();
			}
			System.out.printf("%4d", i);
		}

	}

}
