package com.listerners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestcaseEx {
	
//	@Test(invocationCount=5)
	
	@Test(retryAnalyzer=RetryFailedExample.class)
	public void tenthResult() {
		Assert.assertTrue(false);
		System.out.println("Im Failed");
	}
	@Test
	public void twelthResult() {
		System.out.println("Im pass");
	}

}
