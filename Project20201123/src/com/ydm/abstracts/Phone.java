
//201124
//추상 클래스

package com.ydm.abstracts;

public abstract class Phone { //abstract(추상 클래스) 선언
	
	//field
	public String owner;
	
	//constructor
	public Phone() {}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//abstract
	public abstract void ring();
	public abstract void turnOff();

}
