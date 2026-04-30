package Array;

import java.util.*;

public class ASCAndDESC {
	public static void ascendingOrder(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}

			}
		}
	}

	public static void descendingOrder(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		// Printing Ascending Order
		ascendingOrder(array);
		System.out.println(Arrays.toString(array));

		// Printing Descending Order
		descendingOrder(array);
		System.out.println(Arrays.toString(array));

		scanner.close();
	}

}
