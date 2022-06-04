package com.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	By place = By.id("location");
	By hotel = By.id("hotels");
	By roomType = By.id("room_type");
	By roomNo = By.id("room_nos");	
	By inDate = By.id("datepick_in");
	By outDate = By.id("datepick_out");
	By adult = By.id("adult_room");
	By child = By.id("child_room");
	By submit = By.id("Submit");

	public WebElement place() {
		return driver.findElement(place);
	}
	public WebElement hotel() {
		return driver.findElement(hotel);
	}
	public WebElement roomType() {
		return driver.findElement(roomType);
	}
	public WebElement roomNo() {
		return driver.findElement(roomNo);
	}

	public WebElement inDate() {
		return driver.findElement(inDate);

	}
	public WebElement outDate() {
		return driver.findElement(outDate);

	}
	public WebElement adult() {
		return driver.findElement(adult);
	}
	public WebElement child() {
		return driver.findElement(child);
	}
	public WebElement submit() {
		return driver.findElement(submit);

	}
}	














