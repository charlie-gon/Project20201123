
//201124
//인터페이스

package com.yedam.interfaces;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv turn on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv turn off");
	}

}
