 package com.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPageAdactin extends BaseClass {
	
	By loginName = By.id("username");
	By loginPassword = By.id("password");
	By login = By.id("login");
	
	public WebElement loginName() {
		return driver.findElement(loginName);	
	}
	public WebElement loginPassword() {
		return driver.findElement(loginPassword);

	}
	public WebElement login() {
		return driver.findElement(login);
	}
}
