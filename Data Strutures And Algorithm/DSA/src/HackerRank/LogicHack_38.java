package HackerRank;
import java.util.*;

public class LogicHack_38 {

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int result = check(array);
        printCount(result);
    }
    
    public static int check(int[] array) {
    	int count=0;
    	for(int i=0;i<array.length;i++) {
    		for(int j=i+1;j<array.length;j++) {
    			if(array[i] < array[j]){
    				if((array[i]+array[j]) % 2 == 0) {
    					count++;
    				}
    			}
    		}
    	}
    	return count;
    }

    public static void printCount(int count) {
    	System.out.println(count);
    }

    public static void main(String[] args) {
        input();
    }
}
