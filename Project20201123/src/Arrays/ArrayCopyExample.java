
//201124

package Arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		
		//배열복사
		char[] arr1 = {'G','O','O','D'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); 
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //arr1의 1번째부터 3번째 인덱스 복사(마지막 인덱스는 포함되지 않음)
		System.out.println(arr3);
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		int[][]original = {{1,2},{3,4}};
		
		//equals
		System.out.println("얕은 복제 후 비교");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		
		//deepequals
	 
	}

}