package HackerRank;
import java.util.*;

public class LogicHack_39 {
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		int result = checkMajority(array);
		display(result);
		
		
		scanner.close();
	}
	public static int checkMajority(int[] array) {
		Arrays.sort(array);
		int count=1;
		for(int i=1;i<array.length;i++) {
			if(array[i] == array[i-1]) {
				count++;
				if(count>(array.length/2)) {
					return array[i];
				}
			}else{
				count=1;
			}
		}
		return -1;
		
	}
	public static void display(int result) {
		System.out.println(result);
	}
	public static void main(String[] args) {
		input();
	}

}
