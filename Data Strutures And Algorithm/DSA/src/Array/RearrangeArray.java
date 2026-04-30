package Array;

import java.util.*;

public class RearrangeArray {
	public static int[] rearrangeElements(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = n / 2, j = n - 1; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		return nums;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		array = rearrangeElements(array);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
