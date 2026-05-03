package Array;

import java.util.*;

public class SymmetricPairs {
	public static void findSymmetricPairs(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i][0] == nums[j][1] && nums[i][1] == nums[j][0]) {
					System.out.print("(" + nums[i][0] + "," + nums[i][1] + ")" + " <--> " + "(" + nums[j][0] + ","
							+ nums[j][1] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Symmetric pairs :: ");
		int rows = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] array = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		//
		System.out.println("Print Elelements :: ");
		for (int i = 0; i < rows; i++) {
			System.out.print("(" + array[i][0] + "," + array[i][1] + ")");

		}
		System.out.println();
		System.out.println("Symmetric Pairs ::: ");
		findSymmetricPairs(array);
		scanner.close();
	}

}
