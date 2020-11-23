
//201123
//클래스 상속 연습

package com.yedam.inheritance;

public class NewChild extends Parent{
	public static void main(String[] args) {
		String field3;
		
		public NewChild(String f1, String f3) {
			super(f1);
			this.field3 = f3;
		}
		
		public void method3() {
			System.out.println("method3() 호출");
		}
		
		
	}

}
