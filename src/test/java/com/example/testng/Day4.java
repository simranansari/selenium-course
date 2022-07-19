package com.example.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
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

	
	
	
	
	
	
	
//	@Parameters({ "URL" })
//	@Test
//	public void WebloginHomeLoan(String uname)
//	{
//		//selenium
//		System.out.println("webloginhomePersonalLoan");
//		System.out.println(uname);
//		
//	}
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
