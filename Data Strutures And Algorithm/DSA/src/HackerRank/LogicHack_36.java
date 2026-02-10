package HackerRank;
import java.util.*;
public class LogicHack_36 {
	public static void input() {
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = obj.nextInt();
		}
		int result = checkConsecutive(array);
		display(result);
	}
	public static int checkConsecutive(int[] array) {
		int count=0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if((array[j]-array[i])==1) {
					count++;
				}
			}
		}
		return count;
	}
	static void display(int res) {
		System.out.println(res);
	}
	public static void main(String[] args) {
		input();
	}

}





//Input Format
//
//7 
// 1 9 3 10 4 20 2
//
//Constraints
//
//n>0
//
//Output Format
//
//4