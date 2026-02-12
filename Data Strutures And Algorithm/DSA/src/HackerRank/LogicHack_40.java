package HackerRank;
import java.util.*;
public class LogicHack_40 {
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		int k = scanner.nextInt();
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		int result = checkSubArraySum(array,k);
		display(result);
		scanner.close();
	}
	public static int checkSubArraySum(int[] array, int k) {
		int count=0, n = array.length;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum+=array[j];
				if(sum%k == 0) {
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
