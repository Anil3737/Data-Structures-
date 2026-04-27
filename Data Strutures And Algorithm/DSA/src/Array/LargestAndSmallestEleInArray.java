package Array;

import java.util.*;

public class LargestAndSmallestEleInArray {
	record Result(int small, int large) {
	} // using record concept returning two values i.e small and large from array
		// elements

	public static Result findLargeSmallEle(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int large = nums[0];
		int small = nums[0];
		for (int num : nums) {
			if (num < small) {
				small = num;
			}
			if (num > large) {
				large = num;
			}
		}
		return new Result(small, large);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		Result res = findLargeSmallEle(array);
		System.out.println("small Element : "+res.small);
		System.out.println("Large Element : "+res.large);

		scanner.close();
	}

}
