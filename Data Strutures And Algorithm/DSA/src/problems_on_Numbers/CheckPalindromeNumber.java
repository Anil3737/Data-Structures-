package problems_on_Numbers;

import java.util.*;

public class CheckPalindromeNumber {
	public static boolean check(int number) {
		if (number < 0 || number % 10 == 0 && number != 0) {
			return false;
		}
		int reverse = 0;
		while (number > reverse) {
			int rem = number % 10;
			reverse = (reverse * 10) + rem;
			number /= 10;
		}
		return number == reverse || number == reverse / 10;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(check(number));

		scanner.close();
	}

}
