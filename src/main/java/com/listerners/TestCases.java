package com.listerners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	WebDriver driver;
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Siddu");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	}
//	@Test
//	public void failTest() {
//		Assert.assertTrue(false);
//	} 
	
	@Test(retryAnalyzer=RetryFailedExample.class)
	public void tenthResult() {
		Assert.assertTrue(false);
		System.out.println("Im Failed");
	}
}
