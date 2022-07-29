package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
			System.out.println("Test Case execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Case execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		System.out.println("Test Case execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Case execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

}
