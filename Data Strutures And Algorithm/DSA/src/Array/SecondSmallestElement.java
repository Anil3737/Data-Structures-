package Array;

import java.util.*;

public class SecondSmallestElement {
	public static int secondSmallest_1(int[] nums) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else {
				if (num > smallest && num < secondSmallest) {
					secondSmallest = num;
				}
			}
		}
		if (secondSmallest == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("No second smallest element");
		}
		return secondSmallest;
	}

	public static int secondSmallest_2(int[] nums) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		if (nums[0] < nums[1]) {
			min = nums[0];
			secondMin = nums[1];
		} else {
			min = nums[1];
			secondMin = nums[0];
		}
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] < min) {
				secondMin = min;
				min = nums[i];
			} else if (nums[i] > min && nums[i] < secondMin) {
				secondMin = nums[i];
			}

		}
		if (secondMin == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("NO Second Smallest Element");
		}
		return secondMin;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scanner.nextInt();
		if (size < 2) {
			throw new IllegalArgumentException("Atleast Two Elements");
		}
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(secondSmallest_1(array));
		System.out.println(secondSmallest_2(array));

	}

}
