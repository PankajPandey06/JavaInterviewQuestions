package com.qa.javaProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static String names[] = { "Java", "C++", "Python", "C++", "Python" };

	public static void duplicateElementsFinder() {

		Set<String> store = new HashSet<String>();

		System.out.println("Array of names is : " + Arrays.toString(names));

		for (String name : names) {

			if (store.add(name) == false) {

				System.out.println("Duplicate element found  --->  " + name);
			}
		}
	}

	public static void main(String[] args) {

		duplicateElementsFinder();

	}

}
