package com.example.testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	// It execute once all the test cases are completed in that folder where it belongs.It belongs to 1 folder only.
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
	}
	
	// It will onlt execute once all the test completed in all the test folders
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the no 1 from last ");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
	
}
	
	
	
	
//	@Test
//	public void Demo()
//	{
//		System.out.println("hello");//automation
//		Assert.assertTrue(false);
//	}
//	
	
//	@Test
//	public void SecondTest()
//	{
//		System.out.println("bye");
//	}
//}
