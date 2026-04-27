package Array;
import java.util.*;
public class SmallElementArray {
	public int smallElement(int[] nums) throws Exception {
		if(nums.length == 0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int small = nums[0];
		int index = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] < small) {
				small = nums[i];
				index = i;
				//return new int[] {i};
			}
		}
		return index;
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		SmallElementArray se = new SmallElementArray();
		System.out.println(se.smallElement(array));
		
		scanner.close();
	}

}
