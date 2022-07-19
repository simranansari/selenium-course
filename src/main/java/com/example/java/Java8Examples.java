package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Java8Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Aroma");
		names.add("Murat");
		names.add("Zaroon");
		names.add("Amaron");
		names.add("Zafar");
		names.add("Zayn");
		
		//1 - count the no of names starting with alphabet Z in list
		int count1=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("Z"))
			{
				count1++;
			}
		}
		System.out.println(count1);
		
		
		//2 - instead of using for loop we use filter & count here
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Aroma");
		names1.add("Murat");
		names1.add("Zaroon");
		names1.add("Amaron");
		names1.add("Zafar");
		names1.add("Zayn");
		
		//3 - there is no life for intermediate oprtn if there is no terminal oprtn
		     //terminal oprtn will execute only if intermediate oprtn (filter) returns true
		     //we can create stream
		     //how to use filter in stream API
		Long c=names1.stream().filter(s->s.startsWith("Z")).count();
		System.out.println(c);
		
		long d=Stream.of("Aroma","Murat","Zaroon","Amaron","Zafar","Zayn").filter(s->
		{
			s.startsWith("Z");
			return true;
		}).count();
		System.out.println(d);
		
		//4 - print all the names of ArrayList
		names1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names1.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		ArrayList<String> names3 = new ArrayList<String>();
		names3.add("Faizal");
		names3.add("Shafaq");
		names3.add("Hamza");
		names3.add("Kerim");
		
		//5 - print names which have last letter as "n" with Uppercase using map
		Stream.of("Aroma","Murat","Zaroon","Amaron","Zafar","Zayn").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//6 - print names which have first letter as "Z" with Uppercase & sorted using map
		List<String>names2=Arrays.asList("Aroma","Murat","Zaroon","Amaron","Zafar","Zayn");
		names2.stream().filter(s->s.startsWith("Z")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//7 - Merging 2 different lists
		Stream<String> newStream =Stream.concat(names3.stream(), names2.stream());
		
		//8 - newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Za11yn"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		//9 - collection of both list using collect 
		
		List<String> ls=Stream.of("Aroma","Murat","Zaroon","Amaron","Zafar","Zayn").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		//10 - with integer
		
		List<Integer>values=Arrays.asList(3,2,4,4,6,8,2,6,7,1,9);
		//print unique no from this array
		//sort the array - 3rd index - 1,2,3,4,5,6,7
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls.get(2));
		
		
		//11 - other way with lambda exprsn & Filter
		long count = names.stream().filter(new Predicate<String>() {

			// 1st type
			@Override
			public boolean test(String t) {
				boolean returnedValue = t.startsWith("S");
				return returnedValue;
			}
			
		}).count();
		
		System.out.println(count);
		
		// 2nd type
		names.stream().filter(s -> s.startsWith("s")).count(); // s -> s.startsWith("s")
		
	}

}
