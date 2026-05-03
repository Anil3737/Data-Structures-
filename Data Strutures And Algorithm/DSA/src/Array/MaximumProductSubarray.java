package Array;

import java.util.*;

public class MaximumProductSubarray {
	public static int maximumProduct(int[] nums) {
		int maxProduct = Integer.MIN_VALUE;
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			product = product * nums[i];
			maxProduct = Math.max(maxProduct, product);
			if (product == 0) {
				product = 1;
			}
		}
		product = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			product *= nums[i];
			maxProduct = Math.max(maxProduct, product);
			if (product == 0) {
				product = 1;
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println(maximumProduct(array));

	}

}
