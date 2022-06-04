package com.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By address = By.id("address");
	By ccNum = By.id("cc_num");
	By ccType = By.id("cc_type");
	By ccMon = By.id("cc_exp_month");
	By ccYear = By.id("cc_exp_year");
	By cvvNum = By.id("cc_cvv");
	By bookNow = By.id("book_now");
	By ordNum = By.id("order_no");

	public WebElement firstName() {
		return driver.findElement(firstName);	
	}
	public WebElement lastName() {
		return driver.findElement(lastName);
	}		
	public WebElement address() {
		return driver.findElement(address);
	}		
	public WebElement ccNum() {
		return driver.findElement(ccNum);
	}	

	public  WebElement ccType() {
		return driver.findElement(ccType);

	}	
	public  WebElement ccMon() {
		return driver.findElement(ccMon);
	}		
	public  WebElement ccYear() {
		return driver.findElement(ccYear);
	}		
	public WebElement cvvNum() {
		return driver.findElement(cvvNum);
	}		
	public WebElement bookNow() {
		return driver.findElement(bookNow);

	}
	public WebElement ordNum() {
		return driver.findElement(ordNum);

	}


}



