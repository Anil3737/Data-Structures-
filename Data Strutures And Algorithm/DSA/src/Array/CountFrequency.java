package Array;

import java.util.*;

public class CountFrequency {
	public static void countFreq(int[] nums) {
		int max = nums[0];
		for(int num:nums) {
			if(num>max) {
				max = num;
			}
		}
		int[] freq = new int[max+1];
		for(int i:nums) {
			freq[i]++;
		}
		display(freq);
		
	}
	public static void display(int[] freq) {
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
			System.out.println(i+" "+freq[i]);
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
		countFreq(array);
		
		scanner.close();
	}

}
