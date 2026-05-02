package Array;

import java.util.*;

public class RepeatingElements {
	public static void repeatingEle(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				System.out.print(nums[i] + " ");
				while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}
			}

		}
	}

	public static int[] repeateEle(int[] nums) {
		Arrays.sort(nums);
		int[] temp = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				temp[index++] = nums[i];
				while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}

			}
		}
		return Arrays.copyOf(temp, index);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		repeatingEle(array);
		System.out.println();
		int[] result = repeateEle(array);
		for (int num : result) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

}
