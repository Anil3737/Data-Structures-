package Array;

import java.util.*;

public class SecondLeargeAndSmall {
	public static int secondLargest(int[] nums) {
		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > large) {
				secondLarge = large;
				large = num;
			} else if (num < large && num < secondLarge) {
				secondLarge = num;
			}
		}
		if (secondLarge == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No Second Largest Element");
		}
		return secondLarge;
	}

	public static int secondSmallest(int[] nums) {
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < small) {
				secondSmall = small;
				small = num;
			} else if (num > small && num < secondSmall) {
				secondSmall = num;
			}
		}
		if (secondSmall == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("No Second Smallest Element");
		}
		return secondSmall;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if (size < 2) {
			throw new IllegalArgumentException("Atleast Array Contains Two Elements");
		}
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(secondLargest(array));
		System.out.println(secondSmallest(array));
	}

}
