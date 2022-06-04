package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Select select;
	
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	public void url(String Site) {
		driver.get(Site);
	}

	public void type (WebElement element, String value) {
		element.clear();
		element.sendKeys(value);	
	}
	
	public  void click(WebElement element) {
		element.click();		
	}
	
	public static  WebElement byId(String locator) {
		return  driver.findElement(By.id(locator));
	}

	public static  WebElement byName(String locator) {
		return  driver.findElement(By.name(locator));
	}
	
	
	public static void byValue(WebElement element, String value) {
		 select = new Select(element);
			select.selectByValue(value); 
	}
	
	public String pop(String key) throws IOException {
		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\Maven-Project\\credentialsData.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties po = new Properties();
		po.load(fis);	
		String property = po.getProperty(key);
		return property;

	}

	public void closeBrowser() {
		driver.close();
	}

}
