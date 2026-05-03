package Array;

import java.util.*;

public class NonRepeatingElements {
	public static void nonRepeate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 && nums[i] != nums[i + 1]) {
				System.out.print(nums[i] + " ");

			} else if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
				System.out.print(nums[i] + " ");
			} else if (i > 0 && i < nums.length - 1 && nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
				System.out.print(nums[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		nonRepeate(array);

		scanner.close();
	}

}
