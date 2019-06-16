package com.qa.javaProgramming;

public class ReverseString {

	public static String s = "Hello Selenium";
	public static String reverse = "";
	
	public static void reverseString(){
		
		for(int i= s.length()-1; i>=0; i-- ){
			
			reverse = reverse + s.charAt(i);
		}
		System.out.println("String before reversal ---> " + s);
		System.out.println("String after reversal  ---> " + reverse);
	}
	
	
	public static void main(String[] args) {
		
		reverseString();

	}

}
