package Array;

import java.util.*;

class Solution {
	public int arraySum1(int[] array) {
		return Arrays.stream(array).sum();
	}

	public int arraySum2(int[] array) {
		int totalSum = 0;
		for (int i : array) {
			totalSum += i;
		}
		return totalSum;
	}
}

public class SumElementsInArray {
	public static void main(String[] anil) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		Solution sol = new Solution();
		int res1 = sol.arraySum1(array);
		int res2 = sol.arraySum1(array);
		System.out.println(res1);
		System.out.println(res2);
		scanner.close();
	}
}
