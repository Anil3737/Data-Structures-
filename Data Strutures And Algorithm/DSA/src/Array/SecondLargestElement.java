package Array;

import java.util.*;

public class SecondLargestElement {
	public static int secondLargest_1(int[] nums) {
		int n = nums.length;
		int largest = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > largest) {
				secondLarge = largest;
				largest = num;
			} else {
				if (num < largest && num > secondLarge) {
					secondLarge = num;
				}
			}
		}
		return secondLarge;
	}

	public static int secondLargest_2(int[] nums) {
		int max1 = 0;
		int max2 = 0;
		if (nums[0] > nums[1]) {
			max1 = nums[0];
			max2 = nums[1];
		} else if (nums[1] > nums[0]) {
			max1 = nums[1];
			max2 = nums[0];
		}
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > max1) {
				max2 = max1;
				max1 = nums[i];
			} else if (nums[i] < max1 && nums[i] > max2) {
				max2 = nums[i];

			}

		}
		return max2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if (size < 2) {
			throw new IllegalArgumentException("Atleast Two Elements");
		}
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		// secondLargest(array);
		System.out.println(secondLargest_1(array));
		System.out.println(secondLargest_2(array));

		scanner.close();
	}

}
