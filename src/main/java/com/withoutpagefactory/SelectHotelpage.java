package com.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class SelectHotelpage extends BaseClass {


	By button = By.id("radiobutton_0");
	By okay = By.id("continue");

	public WebElement button() {
		return driver.findElement(button);
	}

	public WebElement okay() {
		return driver.findElement(okay);
	}	

}


