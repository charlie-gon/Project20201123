
//201123
//Class 3
//교재 p.499~ string 실습

package com.yedam.string;

import java.io.UnsupportedEncodingException;

public class StringExample {
	public static void main(String[] args) {
		
		//문자열 추출_charAt()
		String menu = "햄버거 피자 치킨 콜라";
		char lunch = menu.charAt(7);
		char lunch1 = menu.charAt(8);
		System.out.println(lunch + "" + lunch1); 
		//정수형 char를 사용하여 lunch + lunch1 결과값을 출력하면 정수형 숫자가 출력
		//문자로 출력하고 싶다면 가운데 "" 삽입하여 문자형이라고 인식시켜 주어야 한다
		
		//문자열 비교_equals()
		String strVar1 = new String("김찬곤");
		String strVar2 = "김찬곤";
		
		if(strVar1 == strVar2) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("Same Same");
		}else {
			System.out.println("Different Different");
		}
		
		//바이트 배열로 변환_getBytes()
		
		String str = "Gukbap";
		
		byte[] bytes1 = str.getBytes(); //문자를바이트 배열로 변환
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1); //바이트 배열을 다시 문자열로 변환
		System.out.println("bytes->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//문자열 찾기_indexOf()
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		
		// -1을 리턴하면 특정 문자열이 포함되어 있지 않다는 의미
		// "자바"라는 단어가 포함되어 있지 않는게 맞다면 True, 반대라면 False 리턴
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바 맞네요");
		}else {
			System.out.println("자바 아니네요");
		}
		
		//문자열 길이_length()
		String ssn = "7788545";
		int length = ssn.length();
		if(length == 7) {
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}
		
		//문자열 대치_replace()
		String oldStr = "치킨은 사랑입니다. 치킨은 죄가 없습니다.";
		String newStr = oldStr.replace("치킨", "Chicken");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 잘라내기_substring()
		String substr = "010-7143-2153";
		
		String firstNum = substr.substring(4,8);
		System.out.println(firstNum);
		
		String secondNum = substr.substring(9);
		System.out.println(secondNum);
		
		//알파켓 대소문자 변경_toLowerCase, toUpperCase
		
		String str11 = "Java Programming";
		String str22 = "JAVA PROGRAMMING";
		
		System.out.println(str11.equals(str22));
		
		String toUpper = str11.toUpperCase();
		String toLower = str22.toUpperCase();
		
		System.out.println(toUpper.equals(toLower));
		System.out.println(toUpper + " " + toLower);
		
		//문자열 앞뒤 공백 잘라내기_trim()
		String tel1 = "  010  ";
		String tel2 = "7143   ";
		String tel3 = "  2153";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
		
		//문자열 변환_valueOf
		String value1 = String.valueOf(10);
		String value2 = String.valueOf(10.5);
		String value3 = String.valueOf(true);
		String value4 = String.valueOf("Chicken");
		System.out.println(value1 + value2 + value3 + value4);
		
	}

}
