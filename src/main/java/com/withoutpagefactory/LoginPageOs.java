package com.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPageOs extends BaseClass {

	By Username = By.id("txtUsername");
	By Password = By.id("txtPassword");
	By submit = By.name("Submit");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public WebElement Username() {
		return driver.findElement(Username);	
	}
	public WebElement Password() {
		return driver.findElement(Password);

	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	






}
