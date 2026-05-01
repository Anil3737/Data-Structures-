package Array;

import java.util.*;

public class AverageOfArray {
	public static double averageOfElements(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("Array Cannot be Empty");
		}
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		return (double) sum / nums.length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print(averageOfElements(array));

		scanner.close();
	}
}
