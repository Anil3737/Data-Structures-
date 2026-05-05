package Array;

import java.util.*;

public class EquilibriumIndex {
	public static int equilibriumIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += nums[j];
			}
			for (int k = i + 1; k < nums.length; k++) {
				rightSum += nums[k];

			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;

	}

	public static int findEquilibriumIdx(int[] nums) {
		int n = nums.length;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += nums[i];
		}
		int leftSum = 0, rightSum = totalSum;
		for (int i = 0; i < n; i++) {
			rightSum -= nums[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println(equilibriumIndex(array));
		System.out.println(findEquilibriumIdx(array));

		scanner.close();
	}

}
