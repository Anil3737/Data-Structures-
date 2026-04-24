package Leetcode;

import java.util.*;

public class MoveZeroes {
	public static void moveZerores(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while (count < n) {
			nums[count++] = 0;
		}
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		moveZerores(array);
	}
}
