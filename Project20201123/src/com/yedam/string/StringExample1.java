
//201123
//Class 3
//연습(교재 11장)

package com.yedam.string;

public class StringExample1 {
	public static void main(String[] args) {

		String birth1 = "991123-1234567";
		String birth2 = "991112_2345678";
		String birth3 = "010101*3123456";
		String birth4 = "02020244211234";

		// 7번째 자리 숫자라 1,2이면 2000년대 이전 출생 남자, 3이면 2000년대 이전 출생 여자

		String[] births = { birth1, birth2, birth3, birth4 };
		for (int i = 0; i < births.length; i++) {
			char birth = births[i].charAt(7);
			switch (birth) {
			case '1':
			case '2':
				System.out.println("male");
				break;
			case '3':
			case '4':
				System.out.println("female");
				break;
			}

		}

	}

}
