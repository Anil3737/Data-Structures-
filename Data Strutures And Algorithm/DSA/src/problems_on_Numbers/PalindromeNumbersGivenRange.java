package problems_on_Numbers;

import java.util.*;

public class PalindromeNumbersGivenRange {
	public static boolean isPalindrome(int num) {
		if (num < 0 || (num % 10 == 0 && num != 0)) {
			return false;
		}
		int reverse = 0;
		while (num > reverse) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		return num == reverse || num == reverse / 10;
	}

	static void palindromeInRange(int min, int max) {
		int count = 0;
		for (int i = min; i <= max; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		palindromeInRange(min, max);

		scanner.close();
	}

}
