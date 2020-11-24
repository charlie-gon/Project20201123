
//201124
//추상 클래스

package com.ydm.abstracts;

public class SmartPhone extends Phone{

	@Override //부모가 가진 추상 메소드를 재정의 한다는 의미
	public void ring() {//상속 받게 되면 부모가 가진 추상 메소드를 반드시 구현하게 되어 있음
		// TODO Auto-generated method stub
		System.out.println("스마트폰 벨이 울려요");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰이 꺼집니다");
	}

}
