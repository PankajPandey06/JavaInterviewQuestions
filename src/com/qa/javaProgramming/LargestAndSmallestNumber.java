package com.qa.javaProgramming;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static int numbers[] = { -20, -1, -10, 70, 100, 0, 5, 7, 1020 };
	public static int largest = numbers[0];
	public static int smallest = numbers[0];

	public static void largestAndSmallest() {

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {

				largest = numbers[i];
			}

			else if (numbers[i] < smallest) {

				smallest = numbers[i];
			}
		}

		System.out.println("Array of names is : " + Arrays.toString(numbers));
		System.out.println("Largest number is  ----> " + largest);
		System.out.println("Smallest number is  ----> " + smallest);

	}

	public static void main(String[] args) {

		largestAndSmallest();
	}

}
