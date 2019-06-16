package com.qa.javaProgramming;

import java.util.Arrays;

public class DuplicateElemntsByComparing {

	public static String names[] = { "Java", "C++", "Python", "C++", "Python" };

	
	//O(n*n)
	public static void duplicateElementsByComparing() {

		System.out.println("Array of names is : " + Arrays.toString(names));

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {

					System.out.println("Duplicate elemnt found ---> " + names[i]);
				}
			}

		}

	}

	public static void main(String[] args) {

		duplicateElementsByComparing();
	}

}
