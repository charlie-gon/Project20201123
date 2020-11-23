
//201123
//클래스 상속 연습

package com.yedam.address;

public class UnivFriend extends Friend{
	
	//Field
	private String univ;
	private String major;
	
	//Constructor
	public UnivFriend(String name, String phone) { //source - Generate Constructor from Superclass를 통해 간단히 부모 클래스를 받는 생성자 만들기 가능
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	//Method
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	//부모 클래스의 showFriendInfo를 그대로 보여주겠다.
	@Override
	public void showFriendinfo() { //source - 맨 위 옵션 선택하면 간단히 Override 생성 가능
//		super.showFriendinfo();
		System.out.println("이름: " + super.getName());
		System.out.println("연락처: " + super.getPhone());
		System.out.println("학교: " + this.univ);
		System.out.println("전공: " + this.major);
		
		
		
		//부모 클래스를 그대로 호출하는 대신 재정의(Override)하는 작업
		//super.get으로 부모 클래스의 필드값 불러오고, 내용에 맞게 클래스 내에 정의한 필드값 추가
	}
	
	
	

}
