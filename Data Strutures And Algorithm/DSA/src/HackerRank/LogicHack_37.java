package HackerRank;
import java.util.*;

public class LogicHack_37 {
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt(),k=scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		int result = checkDifference(array,k);
		display(result);
		
		scanner.close();
	}
	public static int checkDifference(int[] array, int k) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(Math.abs(array[i] - array[j]) == k) {
					count++;
				}
			}
		}
		return count;
	}
	public static void display(int count) {
		System.out.println(count);
	}
	public static void main(String[] args) {
		input();
	}

}
