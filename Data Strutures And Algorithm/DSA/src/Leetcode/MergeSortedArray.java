package Leetcode;
import java.util.*;
public class MergeSortedArray {
	public static int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		while(j>=0) {
			if(i>=0 && nums1[i]>nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			}
			else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		return nums1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Merge Sorted Array");
		System.out.println("Enter M value :: ");
		int m = scanner.nextInt();
		System.out.println("Enter "+m+" Elements :: ");		
		int[] temp = new int[m];
		for(int i=0;i<m;i++) {
			temp[i] = scanner.nextInt();
		}
		System.out.println("Array 2 :");
		System.out.println("Enter n value :: ");
		int n = scanner.nextInt();
		System.out.println("Enter "+n+" Elements :: ");
		int[] array2 = new int[n];
		for(int i=0;i<n;i++) {
			array2[i] = scanner.nextInt();
		}
		int[] array1 = new int[m+n];
		for(int i=0;i<m;i++) {
			array1[i] = temp[i];
		}
		mergeArray(array1,m,array2,n);
		for(int num : array1) {
			System.out.print(num+" ");
		}
		
		scanner.close();
	}

}
