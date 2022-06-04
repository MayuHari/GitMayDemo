package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test(priority=0)
	@Parameters("SonName")
	public void welcomeMsg(String name) {
		System.out.println("Welcome to the world my dear son "+ name);
	}

	@Test(priority=1)
	@Parameters("momName")
	public void endMsg(@Optional("msg")String name) {
		System.out.println("By Mommy "); 
	}
}
