package Leetcode;
import java.util.*;
public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		for(int i=1;i<nums.length;i++) {
			currentSum = Math.max(nums[i], currentSum+nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		System.out.println("Enter "+size +" +Elements :: ");
		int [] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		int result = maxSubArray(array);
		System.out.println(result);
	}

}
