package Leetcode;

import java.util.Scanner;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("enter " + size + " numbers :: ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter Target :: ");
		int target = scanner.nextInt();
		int[] result = twoSum(array, target);
		if (result != null) {
			System.out.println("Indices: " + result[0] + " , " + result[1]);
			System.out.println("Numbers: " + array[result[0]] + " , " + array[result[1]]);
		} else {
			System.out.println("No two numbers add up to the target.");
		}
	}

}
