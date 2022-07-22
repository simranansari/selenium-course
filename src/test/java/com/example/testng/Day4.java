package com.example.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
// Centralized - those values which are common across all the test folder u can define those parameters here after the suite
	// values those are specific to particular test folder then u should define inside the test folder Xml file.
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("webloginhome");
	}
	
	
	// Groups concept is use to run few particular test cases out of 100 from diff class files
	@Test(groups={"Smoke"})
	public void GrpMobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	
	@Test
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
//	
//	
	
//	
//	@Test
//	public void LoginAPIHomeLoan()
//	{
//		//Rest API automation
//		System.out.println("APIloginHome");
//	}
//}
