package Array;
import java.util.*;
public class ReverseArray {
	public static int[] reverseArray(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			
			
			left ++;
			right --;
			
		}
		return nums;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		array = reverseArray(array);
		for(int num: array) {
			System.out.print(num+" ");
		}
		
		
		scanner.close();
	}

}
