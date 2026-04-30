package Array;

import java.util.*;

public class RotateArrayByNTimes {
	public static void rotateArray(int[] nums, int k) {
		int n = nums.length;
		if (n == 0)
			return;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
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
		System.out.print("Enter Array Size :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter K Value :: ");
		int k = scanner.nextInt();
		if (k <= 0) {
			throw new IllegalArgumentException("K cannot be nagative");
		}

		rotateArray(array, k);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
