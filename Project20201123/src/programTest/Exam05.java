
//201126
//자바 시험 문제 5
//김찬곤

package programTest;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("정수 10개를 입력합니다.");
		System.out.println("시작하려면 1번을 누르세요");
		int selectNo = scn.nextInt();

		if (selectNo == 1) {
			System.out.print("첫번째 입력: ");
			int firstNum = scn.nextInt();
			System.out.print("두번째 입력: ");
			int secondNum = scn.nextInt();
			System.out.print("세번째 입력: ");
			int thirdNum = scn.nextInt();
			System.out.print("네번째 입력: ");
			int fourthNum = scn.nextInt();
			System.out.print("다섯번째 입력: ");
			int fifthNum = scn.nextInt();
			System.out.print("여섯번째 입력: ");
			int sixthNum = scn.nextInt();
			System.out.print("일곱번째 입력: ");
			int seventhNum = scn.nextInt();
			System.out.print("여덟번째 입력: ");
			int eighthNum = scn.nextInt();
			System.out.print("아홉번째 입력: ");
			int ninthNum = scn.nextInt();
			System.out.print("열번째 입력: ");
			int tenthNum = scn.nextInt();

			int even = 0;
			int odd = 0;
			int[] array = { firstNum, secondNum, thirdNum, fourthNum, fifthNum, sixthNum, seventhNum, eighthNum,
					ninthNum, tenthNum };
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) { // 짝수만
					even += array[i];

				} else if (array[i] % 2 != 0) {
					odd += array[i];

				}
			}
			System.out.println("짝수의 합: " + even);
			System.out.println("홀수의 합: " + odd);

		}
	}

}
