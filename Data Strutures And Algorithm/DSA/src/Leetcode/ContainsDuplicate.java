package Leetcode;
import java.util.*;
public class ContainsDuplicate {
	public static boolean containDuplicate(int []nums) {
		Arrays.sort(nums); // sorting  //  // O(n log n)
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				return true;
			}
		}
		// 1 other way to solve
	/*	Arrays.sort(nums); // sorting  //  // O(n log n)
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		**/
		// 2 Using Nested for loops
		/* for(int i=0;i<nums.length;i++) {   // O(n²)
			for(intj=0;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					return true;
				}
			}
			}
			**/
	
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size :: ");
		int size = scanner.nextInt();
		System.out.println("Enter "+size+" Elements :: ");
		int [] array =  new int[size];
	
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(containDuplicate(array));
	}

}
