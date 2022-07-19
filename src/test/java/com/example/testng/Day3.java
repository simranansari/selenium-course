package com.example.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	// Before executing any methods in the class
	@BeforeClass
	public void befoclas() {
		System.out.println("Before executing any methods in the class");
	}


	@Test
	public void WebloginCarLoan() {
		// selenium
		System.out.println("weblogincar");
	}
	
	
	// Before executing each & every test block this method will execute
	@BeforeMethod
	public void beforeevery() {
		
		System.out.println(" I will execute before every test method in day 3 class");
	}
	
	
	// It will execute after each & every test block this method will execute 
	@AfterMethod
	public void afterevery() {
		System.out.println(" I will execute after  every test method in day 3 class");
	}

	
	// After executing all methods in the class
	@AfterClass
	public void afteclas() {
		System.out.println("After executing all methods in the class");
	}
	
	
	// Groups concept is use to run few particular test cases out of 100 from diff class files
	@Test(groups = { "Smoke" })
	public void GrpMobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}
	
	
	@Test
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}

	
	// It will execute before any test in this XML file
	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am no 1");
	}
	
	
	// Enabled annotation will safely skip this test case while execution.It is a helper attribute.
	@Test(enabled = false)
	public void MobilesignimcarLoan() {
		// Appium
		System.out.println("Mobile SIGIN");
	}

	
	// If any test taking long time to execute & test cases getting fail bcz of that instd of implicit wait use "timeOut".
	//             It will wait till n sec before throwng excptn. It is a helper attribute.
	@Test(timeOut=4000)
	public void TmOtMobilesignoutcarLoan() {
		// Appium
		System.out.println("Mobile SIGNOUT");
	}
	
	
	@Test
	public void MobilesignincarLoan() {
		// Appium
		System.out.println("Mobile SIGNIN");
	}

	
	@Test
	public void MobilesignoutcarLoan() {
		// Appium
		System.out.println("Mobile SIGNOUT");
	}

	
	// Depends method will execute the containing test case & then release the Method/Test case will executed at the end.
	// & u can use multiple test case name/methods name also.It is a helper attribute.
	@Test(dependsOnMethods = { "WebloginCarLoan", "MobilesignoutcarLoan" })
	public void DepAPIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}
	
	
	
	@Test
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}
	
}	
	
	
	
	
	
	
	
//	@Parameters({ "URL", "APIKey/usrname" })
//	@Test
//	public void WebloginCarLoan(String urlname, String key) {
//		// selenium
//		System.out.println("weblogincar");
//		System.out.println(urlname);
//		System.out.println(key);
//
//	}
//
	
	
	
//
	
//
	
//

//	@Test(dataProvider = "getData")
//	public void MobilesignoutcarLoan(String username, String password) {
//		// Appium
//		System.out.println("Mobile SIGNOUT");
//		System.out.println(username);
//		System.out.println(password);
//
//	}
//
	
//
//	@DataProvider
//	public Object[][] getData() {
//		// 1st combiantion - username password - good credit history= row
//		// 2nd - username password - no crdit history
//		// 3rd - fraudelent credit history
//		Object[][] data = new Object[3][2];
//		// 1st set
//		data[0][0] = "firstsetusername";
//		data[0][1] = "firstpassword";
//		// couloumns in the row are nothing but values for that particualar
//		// combination(row)
//
//		// 2nd set
//		data[1][0] = "secondsetusername";
//		data[1][1] = "secondpassword";
//
//		// 3rd set
//		data[2][0] = "thirdsetusername";
//		data[2][1] = "thirdpassword";
//		return data;
//
//	}
//}
