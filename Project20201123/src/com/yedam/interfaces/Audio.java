
//201124
//인터페이스

package com.yedam.interfaces;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("aud turn on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("aud turn off");
	} //구현한다는 의미의 implements

}
