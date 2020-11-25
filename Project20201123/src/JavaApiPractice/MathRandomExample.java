package JavaApiPractice;

import java.util.Arrays;
import java.util.Random;

public class MathRandomExample {
	
	public static void main(String[] args) {
		
		//select number
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("number: ");
		for(int i = 0; i<selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//win number
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("win numbers are: ");
		for(int i = 0; i<winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.println(winningNumber[i] + " ");
			
			
		}
		System.out.println();
		
		//who's the winner
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("who is the winner: ");
		if(result) {
			System.out.println("Congratulations");
		}else {
			System.out.println("Sorry");
		}
	}
	

}
