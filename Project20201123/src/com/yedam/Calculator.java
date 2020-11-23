
//201123
//Class 3_static

package com.yedam;

public class Calculator {
	
	//field
	private String color;
	static double pi = 3.14; //필드 또한 static 사용 시 인스턴시 없이 사용 가능
	
	//method
	public void setColor(String color) {
		this.color = color;
	}
	
	//static: 인스턴스 없이 클래스에 바로 사용 가능
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}

}
