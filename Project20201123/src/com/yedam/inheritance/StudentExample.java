
//201123
//클래스 상속 연습

package com.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name = "Hong";
		st1.school = "Yedam";
		System.out.println(st1.name + st1.school);
		st1.study();
		
		HighStudent hs1 = new HighStudent();
		hs1.name = "Hwang";
		hs1.school = "Ydm";
		hs1.grade = "2";
		hs1.showGrade();
		
		//Student가 최상위 클래스
		 
//		st1 = new HighStudent(); //가능
//		hs1 = new Student(); //불가능
	}

}
