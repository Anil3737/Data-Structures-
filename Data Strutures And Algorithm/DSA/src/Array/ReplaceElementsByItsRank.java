package Array;

import java.util.*;

public class ReplaceElementsByItsRank {
	public static int[] replaceEleByRank(int[] nums) {
		int n = nums.length;
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = nums[i]; // values
			arr[i][1] = i; // original index
		}

		Arrays.sort(arr, (a, b) -> a[0] - b[0]);

		int[] result = new int[n];
		int rank = 1;

		result[arr[0][1]] = rank;

		for (int i = 1; i < n; i++) {
			if (arr[i][0] != arr[i - 1][0]) {
				rank++;
			}
			result[arr[i][1]] = rank;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int[] result = replaceEleByRank(array);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
