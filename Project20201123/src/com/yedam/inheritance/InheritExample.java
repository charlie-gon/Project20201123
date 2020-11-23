
//201123
//클래스 상속 연습

package com.yedam.inheritance;

public class InheritExample {
	public static void main(String[] args) {
		Parent p1 = new Parent("필드값1");
		System.out.println(p1.field1);
		p1.method1();
		
		
		//상속이 되어서 부모와 자식을 동시에 사용할 수 있음
		Child c1 = new Child("자식필드1", "자식필드2");
		System.out.println(c1.field2);
		System.out.println(c1.field1);
		c1.method1();
		c1.method2();
		
		//따로 상속을 선언하지 않아도 부모 클래스의 메소드를 사용할 수 있음
		GrandChild gc1 = new GrandChild();
		System.out.println(gc1.field1);
		System.out.println(gc1.field2);
		gc1.method1();
		gc1.method2();
		
		
		//부모 클래스가 가장 큰 값을 포함하고 있다. 얼핏 기능은 자식 클래스가 다양해 보이지만.
		Parent p = new Parent();
		p = new Child();
		p = new GrandChild();
		
		
	}

}
