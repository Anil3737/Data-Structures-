package Leetcode;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicate(int[] nums) {
		if (nums.length == 0)
			return 0;
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];

			}

		}

		return j + 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int k = removeDuplicate(array);
		for (int i = 0; i < k; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Unique elements : " + k);
		scanner.close();
	}

}
