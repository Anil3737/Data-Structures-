package problems_on_Numbers;

import java.util.*;

public class PrimeNumberInRange {
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeNumbersInRange(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		int max = scanner.nextInt();

		primeNumbersInRange(min, max);

		scanner.close();
	}

}
