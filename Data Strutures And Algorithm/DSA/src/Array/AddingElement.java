package Array;

import java.util.*;

public class AddingElement {

	public static int[] atBeginning(int[] nums, int number) {
		int[] newArray = new int[nums.length + 1];
		newArray[0] = number;
		for (int i = 0; i < nums.length; i++) {
			newArray[i + 1] = nums[i];
		}
		return newArray;
	}

	public static int[] atEnding(int[] nums, int number) {
		int[] newArray = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			newArray[i] = nums[i];
		}
		newArray[nums.length] = number;
		return newArray;
	}

	public static int[] atAnyPosition(int[] nums, int position, int number) {
		int[] newArray = new int[nums.length + 1];

		for (int i = 0; i < position; i++) {
			newArray[i] = nums[i];
		}
		newArray[position] = number;

		for (int i = position; i < nums.length; i++) {
			newArray[i + 1] = nums[i];
		}

		return newArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println();
		System.out.println("Enter Value to Intsert at Begining :: ");
		int number1 = scanner.nextInt();

		array = atBeginning(array, number1);

		for (int num : array)
			System.out.print(num + " ");
		System.out.println();

		System.out.println("Enter Value to Add At End :: ");
		int number2 = scanner.nextInt();
		array = atEnding(array, number2);
		for (int num : array)
			System.out.print(num + " ");
		System.out.println();

		System.out.println("Add Element At Any Position .. ");
		System.out.println("Enter Position to add element :: ");
		int position = scanner.nextInt();
		System.out.println("Enter Value To Add ");
		int number3 = scanner.nextInt();
		array = atAnyPosition(array, position, number3);
		for (int num : array)
			System.out.print(num + " ");
	}

}
