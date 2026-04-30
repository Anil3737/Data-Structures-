package Array;

import java.util.*;

public class NthLargestElement {
	public static int[] nthLargest(int[] nums, int number) {
		int n = nums.length;
		Arrays.sort(nums);
		int nthLarge = nums[n - number];
		int nthSmall = nums[number - 1];
		return new int[] { nthSmall, nthLarge };
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter Number :: ");
		int number = scanner.nextInt();
		if (number <= 0 || number > array.length) {
			throw new IllegalArgumentException("Number should be between 1 and array size");
		}
		int[] result = nthLargest(array, number);
		// System.out.println(nthLargest(array, number));
		System.out.println(result[0]);
		System.out.println(result[1]);

		scanner.close();
	}

}
