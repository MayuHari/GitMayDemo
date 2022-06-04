package com.listerners;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersExample implements ITestListener {


	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure Testcase         "+ result.getName());
	
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Method        "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start Testcase          "+result.getName());


	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the Testsucess            "+result.getName());


	}
	
	

}
