package Array;

import java.util.*;

public class RotateByKElements {
	public static int[] rotateArray(int[] nums, int k, String str) {
		int n = nums.length;

		k = k % n;
		if (str.equals("right")) {

			reverse(nums, 0, n - 1);
			reverse(nums, 0, k - 1);
			reverse(nums, k, n - 1);
		} else if (str.equals("left")) {
			reverse(nums, 0, k - 1);
			reverse(nums, k, n - 1);
			reverse(nums, 0, n - 1);
		}

		return nums;
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter k value :: ");
		int k = scanner.nextInt();
		System.out.println("Enter Direction right or left :: ");
		String str = scanner.next().toLowerCase().trim();

		int[] result = new int[array.length];
		result = rotateArray(array, k, str);
		for (int num : result) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

}
