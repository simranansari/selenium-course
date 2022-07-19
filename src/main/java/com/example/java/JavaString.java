package com.example.java;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "Hello";
		
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
    	for(int i =s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}

}
