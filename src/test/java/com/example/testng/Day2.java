package com.example.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	// Groups concept is use to run few particular test cases out of 100 from diff class files
	@Test(groups={"Smoke"})
	public void Grpploan()
	{
		System.out.println("good");
	}
	
	
	@Test
	public void ploan()
	{
		System.out.println("good");
	}
	
	
	// Means whatever method u define here that will execute first before any test belonging to that folder.It belongs to 1 folder only.
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
