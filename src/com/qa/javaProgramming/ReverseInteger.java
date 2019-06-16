package com.qa.javaProgramming;

public class ReverseInteger {

	public static int integer = 156;
	public static int reversal = 0;

	public static void reversalOfInteger() {
		
		System.out.println("Number befoe reversal  --> " + integer);
		
		while (integer != 0) {

			int digit = integer % 10;
			reversal = reversal * 10 + digit;

			integer = integer / 10;

		}
		
		System.out.println("Number after reversal  --> " + reversal);

	}

	public static void main(String[] args) {

		reversalOfInteger();

	}

}
