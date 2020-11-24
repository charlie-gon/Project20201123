
//201123
//Class 2

package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		
		//기본 생성자이기 때문에 값을 넣으려면 set method를 활용해야 함
		Student s1 = new Student();
		s1.setSchoolName("감바스대학교");
		s1.setStudentName("김찬곤");
		s1.setStudentNum(5039456);
		s1.setStudentMajor("광고홍보");
		
		//학교이름, 학번 이외 나머지 두 개의 값은 set method를 활용해야 함
		Student s2 = new Student("예담다디대학교", 561239);
		s2.setSchoolName("김예담");
		s2.setStudentMajor("경영학과");
		
		//모든 값이 설정되어 있기 때문에 set method사용하지 않아도 됨
		Student s3 = new Student("감바스대학교", "김빠에야", 456278, "국제통상");
		
		//배열 만드는 방법 숙지!
		//자료형[] 변수 / 자료형 변수 : 배열명
		Student[] students = {s1,s2,s3};
		for(Student s : students) {
			if("감바스대학교".equals(s.getSchoolName())) { //같은 학교 이름 학생만 출력
				s.showStudentInfo();
			}
		}
	}

}
