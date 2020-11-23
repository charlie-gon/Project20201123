
//201123

package com.yedam;

public class car { //car라는 객체를 클래스를 활용하여 정의
	
	//필드
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자(필드 초기값 지정)
	//무조건 필드 초기화 하지 않아도 됨. 경우에 따라 유연하게 사용.
	//앞에 아무것도 없으면 default 되어 동일한 패키지 내에서 접근 가능하게 된다
	//public이면 어디서든 호출 가능

	public car() {
		
	}
	
	public car(String company){
		this.company = company;
	}
	
	public car(String company, String model){
		this.company = company;
		this.model = model;
	}

	public car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
