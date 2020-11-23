
//201123
//Class 2

package com.yedam;

public class Student {
	
	//Field
	private String schoolName;
	private String studentName;
	private int studentNum;
	private String studentMajor;
	
	//Constructor
	//생성자를 만들지 않으면 자바에서 알아서 default값의 생성자를 만들어 준다
	//만약 기본 생성자 이외 다른 생성자를 만들었다면 기본 생성자 또한 만들어야 한다(안그럼 에러 발생)
	public Student() {
		
	}
	
	public Student(String schoolName, int studentNum) {
		this.schoolName = schoolName;
		this.studentNum = studentNum;
	}
	
	public Student(String schoolName, String studentName, int studentNum, String studentMajor) {
		this.schoolName = schoolName;
		this.studentName = studentName;
		this.studentNum = studentNum;
		this.studentMajor = studentMajor;
	}
	
	//Method
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	
	public void showStudentInfo() {
		System.out.println("학교: " + this.schoolName + " 이름: " + this.studentName + " 학번: " + this.studentNum);
	}
	
	
	

}//end of class
