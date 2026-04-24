package Leetcode;

import java.util.*;

public class MaxProductSubArray {
	public static int maxProduct(int[] nums) {
		int n = nums.length;
		int max = Integer.MIN_VALUE;
		int product = 1;
		// from left to right
		for (int i = 0; i < n; i++) {
			product *= nums[i];
			max = Math.max(max, product);
			if (product == 0) {
				product = 1;
			}
		}
		product = 1;
		// from right to left
		for (int i = n - 1; i >= 0; i--) {
			product *= nums[i];
			max = Math.max(max, product);
			if (product == 0) {
				product = 1;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(maxProduct(array));
		scanner.close();
	}

}

