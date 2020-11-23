
//201123

package com.ydm;

//다른 패키지 클래스 가져오는 방법
//step1. 클래스 임포트
//step2. 클래스 설정 public으로 전환

import com.yedam.car; //com.yedam 패키지의 car패키지를 임포트 하면 사용할 수 있음(ctl+shift+o)

public class CarExample {
	public static void main(String[] args) {
		
		//패키지가 다르기 때문에 car클래스 접근이 불가능. 사용하고자 하면 public으로 전환해야 함
		//왠만하면 생성자는 public으로 오픈
		
		car c1 = new car(); 		
		car c2 = new car("현대");
		car c3 = new car("삼성", "SM3");
		
		
		
	}	
	
}
