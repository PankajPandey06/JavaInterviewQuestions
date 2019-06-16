package com.qa.javaProgramming;

public class ReverseIntegerUsingBuffer {

	public static Integer integer = 100;
	public static StringBuffer sb;

	public static void reverseIntegerUsingBuffer() {

		try {
			sb = new StringBuffer(integer.toString());

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Integere before reversal  ----> " + integer);

		System.out.println("Integer after String reversal ---> " + sb.reverse());

	}

	public static void main(String[] args) {

		reverseIntegerUsingBuffer();

	}

}
