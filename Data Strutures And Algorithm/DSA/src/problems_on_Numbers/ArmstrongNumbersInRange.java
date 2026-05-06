package problems_on_Numbers;

import java.util.*;

public class ArmstrongNumbersInRange {
	public static boolean isArmstrong(int num) {
		int sum = 0;
		if (num < 0) {
			return false;
		}
		int temp = num;
		int digits = String.valueOf(num).length();
		while (num != 0) {
			int rem = num % 10;
			sum += (int) Math.pow(rem, digits);
			num /= 10;
		}
		return temp == sum;
	}

	public static void armstrongNumbersInRange(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int min = scanner.nextInt(), max = scanner.nextInt();

		armstrongNumbersInRange(min, max);

		scanner.close();
	}

}
