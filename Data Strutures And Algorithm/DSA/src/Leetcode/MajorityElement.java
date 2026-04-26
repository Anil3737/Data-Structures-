package Leetcode;
import java.util.*;
public class MajorityElement {
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		int count=0;
		int candidate=0;
		for(int num:nums) {
			if(count == 0) {
				candidate = num;
			}
			if(candidate == num) {
				count++;
			}
			else {
				count--;
			}
		}
		return candidate;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(majorityElement(array));
		
		
		scanner.close();
	}

}
