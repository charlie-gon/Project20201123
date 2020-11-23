
//201123
//Class 3_object

package com.yedam;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Object o1 = new Object(); //Object 클래스의 메소드들을 사용 가능
		boolean sameOrDiff = o1.equals(new Object());
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString());
	}

}
