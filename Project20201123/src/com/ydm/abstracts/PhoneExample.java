
//201124
//추상 클래스

package com.ydm.abstracts;

public class PhoneExample {
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.ring();
		phone.turnOff();
		
		DmbPhone dmb = new DmbPhone();
		dmb.ring();
		dmb.turnOff();
		
	}

}
