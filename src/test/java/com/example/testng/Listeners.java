package com.example.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



//ITestListener interface which implements Testng listeners
// when we write like this means v r going to implement all the methods present in this interface
public class Listeners implements ITestListener {

    // In the at the beginning of the test it execute.It's jst like before test
	@Override
	public void onTestStart(ITestResult result) {
	    // TODO Auto-generated method stub
				
	}

			
	//It keep on listening to ur execution results & whenever it listens that script is passed then 
	//  after that script passed this block will got executed.If u don't write anything inside this nothing.
	//   If u write something that method will be printed after each & every test success.
	@Override
	public void onTestSuccess(ITestResult result) {
	     // TODO Auto-generated method stub
				
	//	System.out.println("I successfully executed Listeners Pass code");
	}

			
	//when tests fails automatically the control of ur execution comes to this block.
	//  This means whenever test is fails this class listen to all ur test cases results & whenever 
	//   it listen that something is failed in ur execution quickly this msg will be executed after ur failure.
	@Override
	public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			//screenshot code 
			//response if API is failed
				
			System.out.println("I failed executed Listeners Pass code" +result.getName());

	 }

	
	@Override
	public void onTestSkipped(ITestResult result) {
				// TODO Auto-generated method stub
				
			}

			
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
				
		}

			
	@Override
	public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
				
		}

			
	@Override
	public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
				
	    }

}
