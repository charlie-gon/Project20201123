
//201123
//Class 3_string
//https://docs.oracle.com/javase/8/docs/api/ 참고

package com.yedam;

import java.io.IOException;

public class StringExample {
	public static void main(String[] args) {
		String str1 = new String();
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //byte값을 문자로
		
		String str2 = new String(bytes);
		System.out.println(str2.toString());
		
		String str3 = new String(bytes, 6, 4); //6번째 위치에서 4개를 str3에 담기
		System.out.println(str3.toString());
		
//		byte[] bytes2 = new byte[100];
//		try {
//			int readByteNo = System.in.read(bytes2);
//			String str = new String(bytes2, 0, readByteNo-2);
//			System.out.println(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		char chr = str2.charAt(0);
		System.out.println(chr);
	}

}
