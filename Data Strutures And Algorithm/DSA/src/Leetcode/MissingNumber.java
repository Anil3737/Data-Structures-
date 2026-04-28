package Leetcode;

import java.util.*;

class Solution {
	public int missingNumber_1(int[] nums) {
		int n = nums.length;
		int sum = 0;
		int totalSum = n * (n + 1) / 2;
		for (int num : nums) {
			sum += num;
		}

		return totalSum - sum;
	}
	public int missingNumber_2(int[] nums) {
		int xor = nums.length;
		for(int i=0;i<nums.length;i++) {
			xor ^= i ^ nums[i];
		}
		return xor;
	}
	
}

public class MissingNumber {
	public static void main(String[] anil) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		Solution sol = new Solution();
		System.out.println(sol.missingNumber_1(array));
		System.out.println(sol.missingNumber_2(array));

		scanner.close();
	}

}
