package Array;

import java.util.*;

public class MedianOfArray {
	public static double medianOfArray(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		if (n % 2 == 0) {
			int ind1 = (n / 2) - 1;
			int ind2 = (n / 2);
			return ((nums[ind1] + nums[ind2]) / 2.0);
		} else {
			return nums[n / 2];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		// medianOFArray(array);
		System.out.println(medianOfArray(array));

		scanner.close();
	}

}
