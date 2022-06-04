package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionsOfTestCase {

	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	@Test(priority=0)
	public void launchFaceBook() {
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void launchYouTube() {
		driver.get("https://www.youtube.com/");
	}
	@Test(priority=2)
	public void launchAmazon() {
		driver.get("https://www.amazon.com/");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
		endTime =System.currentTimeMillis();
		long totalTime = endTime-startTime;
		System.out.println(totalTime);

	}










}
