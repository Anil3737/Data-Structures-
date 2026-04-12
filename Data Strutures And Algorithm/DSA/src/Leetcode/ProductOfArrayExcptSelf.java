package Leetcode;

import java.util.*;

public class ProductOfArrayExcptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int productL = 1;
		int productR = 1;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = productR;
			productR = productR * nums[i];
		}
		for (int i = n - 1; i >= 0; i--) {
			ans[i] = ans[i] * productL;
			productL = productL * nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		//productExceptSelf(array);
		System.out.println("Product === " +Arrays.toString(productExceptSelf(array)));
	}
}