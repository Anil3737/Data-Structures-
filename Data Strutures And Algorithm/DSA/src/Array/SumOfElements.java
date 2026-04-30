package Array;

import java.util.*;

public class SumOfElements {
	public static int sumOfElements(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
		// return Arrays.stream(nums).sum();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print(sumOfElements(array));
		scanner.close();
	}

}
