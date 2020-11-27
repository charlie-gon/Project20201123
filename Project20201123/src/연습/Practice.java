
//201127
//오름차순 정렬

package 연습;

import java.util.Scanner;
import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("시작하려면 1번을 누르세요");
		int selectNo = scn.nextInt();

		if (selectNo == 1) {
			System.out.print("첫번째 입력: ");
			int firstNum = scn.nextInt();
			System.out.print("두번째 입력: ");
			int secondNum = scn.nextInt();
			System.out.print("세번째 입력: ");
			int thirdNum = scn.nextInt();

			int[] array = { firstNum, secondNum, thirdNum };
			Arrays.sort(array);
			for (int i : array) {
				System.out.print(" " + i + " ");
			}

		}

	}
}
