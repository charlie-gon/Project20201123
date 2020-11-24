
//201124
//인터페이스

package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();
		
		audio.turnOn();
		audio.turnOff();
		
		tv.turnOn();
		tv.turnOff();
		
		RemoteControl rc = audio; //인터페이스는 인터페이스를 구현한 객체들의 값을 담을 수 있다.
		rc.turnOn();
		rc.turnOff();
		
		rc = tv; //담겨 있는 인스턴스의 값 호출
		rc.turnOn();
		rc.turnOff();
	}

}
