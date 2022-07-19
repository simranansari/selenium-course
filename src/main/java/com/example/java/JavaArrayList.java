package com.example.java;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Mascot");
		a.add("Aroma");
		a.add("Rosalie");
		a.add("Samuel");
		a.add("Amarone");
		a.remove(3);
		a.remove("Aroma");
//		System.out.println(a);
		System.out.println(a.get(0));
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		Integer s = new Integer(1);
		i.remove(s);
		System.out.println(i);
		
	}

}
