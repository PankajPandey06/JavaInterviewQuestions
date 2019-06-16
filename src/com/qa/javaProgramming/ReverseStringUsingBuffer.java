package com.qa.javaProgramming;

public class ReverseStringUsingBuffer {

	public static String string = "Hello Selenium Test Using String Buffer";
	public static String reversal = "";

	public static void reversalUsingStringBuffer() {

		StringBuffer sf = new StringBuffer(string);

		System.out.println("String Before Reversal ---> " + string);
		System.out.println("String after Reversal  ---> " + sf.reverse());

	}

	public static void main(String[] args) {

		reversalUsingStringBuffer();

	}

}
