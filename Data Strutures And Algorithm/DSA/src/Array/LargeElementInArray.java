package Array;

import java.util.*;

public class LargeElementInArray {
	int largestElement(int[] nums) throws Exception {
		if (nums.length == 0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int largest = nums[0];
		for (int num : nums) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest;
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		LargeElementInArray le = new LargeElementInArray();
		System.out.println(le.largestElement(array));
		scanner.close();
	}

}
