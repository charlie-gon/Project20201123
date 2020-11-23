
//201123
//Class 3
//연습

package com.yedam.string;

public class StringExample1 {
	public static void main(String[] args) {
		
		String birth1 = "991123-1234567";
		String birth2 = "991112_2345678";
		String birth3 = "010101*3123456";
		String birth4 = "02020244211234";
		
		String newBirth1 = birth1.replace("-", "0");
		String newBirth2 = birth2.replace("_", "0");
		String newBirth3 = birth3.replace("*", "0");
		
		//7번째 자리 숫자라 1,2이면 2000년대 이전 출생 남자, 3이면 2000년대 이전 출생 여자
		
		String[] births = {newBirth1, newBirth2, newBirth3, birth4};
		for(String b : births) {
			if(b.charAt(7) == 1 && b.charAt(7) == 2) {
				System.out.println("male");
			}else {
				System.out.println("female");
			}
			
		}
		
	}

}
