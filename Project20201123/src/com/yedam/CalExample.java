
//201123
//Class 3_static

package com.yedam;

public class CalExample {
	public static void main(String[] args) {
		
		//인스턴스 만들기(새로운 실체 만들기)
		//new Calculator()의 의미: 생성자 호출
		//Calculator클래스 타입의 c1 변수에 새롭게 만들어진 new Calculator를 담겠다
		Calculator c1 = new Calculator(); 
		c1.setColor("White"); //Calculator 클래스의 set method로 색상 지정
		
//		c1.plus(3, 5); //static은 굳이 인스턴스를 통하지 않고 바로 호출 가능하다.
		
		//static은 굳이 인스턴스를 통하지 않고 바로 호출 가능하다.
		int result = Calculator.plus(3, 5);
		System.out.println(result);
		
		//field에 static으로 선언한 pi는 인스턴스를 통하지 않고 바로 사용 가능
		System.out.println(Calculator.pi);
		
		result = Calculator.minus(10, 5);
		System.out.println(result);
		
		//static 없다면 아래와 같이 인스턴스를 만들어 주어야 한다.
//		CalExample c1 = new CalExample();
//		result = c1.sum(3, 5);
		
		System.out.println(result); //static 이라면 왼쪽과 같이 단독으로 사용 가능
	}
	//static 없다면 인스턴스를 만들어 주어야 한다.
	public static int sum(int a, int b) {
		return a + b;
	}

}

//인스턴스를 거치지 않고 독자적으로 사용하고 싶다면 static 사용
