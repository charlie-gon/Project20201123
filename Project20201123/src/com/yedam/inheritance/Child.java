
//201123
//클래스 상속 연습
//Parent 클래스의 Child 클래스

package com.yedam.inheritance;

public class Child extends Parent{ //extends + 상속자 
	
	String field2;
	
	public Child() {
		super();
	}
	
	public Child(String field1, String field2) {
		super(field1); //부모클래스라는 의미. Parent 클래스의 생성자를 호출하겠다
		this.field2 = field2;
	}
	
	public void method2() {
		super.method1(); //부모 클래스의 method1을 호출하여 method2에 사용하겠다
		System.out.println("method2() 호출.");
	}
	
	
	

}
