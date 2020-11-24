
//201124
//인터페이스 연습문제 5번_교재 387 

package com.yedam.interfaces;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { //익명 구현 개체

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("복사를 합니다.");
			}
			
		};
		action.work();
		
		action = new Action() {

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("운전을 합니다.");
			}
			
		};
		action.work();
	}

}
