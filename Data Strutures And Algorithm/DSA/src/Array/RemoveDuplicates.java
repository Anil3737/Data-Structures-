package Array;

import java.util.*;

public class RemoveDuplicates {
	public static int duplicate(int[] nums) {
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
		int len = duplicate(array);
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
