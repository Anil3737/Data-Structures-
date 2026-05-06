package problems_on_Numbers;

import java.util.*;

public class CheckArmstrongNumberOrNot {
	public static boolean isArmstrong(int num) {
		if (num < 0) {
			return false;
		}
		int sum = 0;
		int temp = num;
		int digits = String.valueOf(num).length();
		while (num != 0) {
			int rem = num % 10;
			sum += (int) Math.pow(rem, digits);
			num /= 10;
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(isArmstrong(number));

		scanner.close();
	}

}
