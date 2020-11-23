
//201123
//클래스 상속 연습

package com.yedam.address;

public class Friend {
	
	//Field
	private String name;
	private String phone;
	
	
	//Constructor
	
	public Friend(String phone) {
		this.phone = phone;
	}
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//
	public void showFriendinfo() {
		System.out.println("이름: " + this.name + " " + "연락처: " + this.phone);
	}

}
