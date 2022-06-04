package com.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedExample implements IRetryAnalyzer{
	
	int failedCount=0;
	int limit =10;

	@Override
	public boolean retry(ITestResult result) {
		if(failedCount<limit) {
			failedCount++;
			return true;
		}
		return false;
		

}
}