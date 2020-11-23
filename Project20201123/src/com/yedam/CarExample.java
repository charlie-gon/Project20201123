
//201123

package com.yedam;

public class CarExample {
	public static void main(String[] args) {

		// 인스턴스 생성(실체 생성)
		car c1 = new car();
		System.out.println(c1.getCompany());
		System.out.println(c1.maxSpeed);
		// 기본 생성자를 호출하여 값이 나오지 않음

		car c2 = new car("현대", "Sonata", "white", 200);
		System.out.println(c2.getCompany());
		System.out.println(c2.getModel());
		System.out.println(c2.getColor());
		System.out.println(c2.getMaxSpeed());

		car c3 = new car("삼성", "SM5");
		c3.setColor("yellow");
		c3.setMaxSpeed(210);

		car c4 = new car("삼성", "SM3");
		c4.setColor("black");
		c4.setMaxSpeed(180);

		car[] cars = { c1, c2, c3, c4 };
		for (car car : cars) {
			if (car != null) {
				if ("삼성".equals(car.getCompany())) {
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());
				}
			}

		}

	}

}

//생성자는 생성 시 무조건 사용해야 하는가?
//get메소드 말고 필드값 호출 안된느지