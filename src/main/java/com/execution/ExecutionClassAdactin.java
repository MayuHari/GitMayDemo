package com.execution;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Test;

import com.base.BaseClass;
import com.withoutpagefactory.BookHotelPage;
import com.withoutpagefactory.LoginPageAdactin;
import com.withoutpagefactory.SearchHotelPage;
import com.withoutpagefactory.SelectHotelpage;


public class ExecutionClassAdactin extends BaseClass{	
//	@Test
	public void adactinBooking() throws IOException, AWTException {
		browserlaunch();
		url(pop("url"));
		
		LoginPageAdactin login = new LoginPageAdactin();
		
		type(login.loginName(),pop("loginName"));
		type(login.loginPassword(),pop("loginPassword"));
		click(login.login());
		
		SearchHotelPage search = new SearchHotelPage();	
		
		byValue(search.place(),pop("place"));
		byValue(search.hotel(),pop("hotel"));
		byValue(search.roomType(),pop("roomType"));
		byValue(search.roomNo(),pop("roomNo"));
		type(search.inDate(),pop("inDate"));
		type(search.outDate(),pop("outDate"));
		byValue(search.adult(),pop("adult"));
		byValue(search.child(),pop("child"));
	    click(search.submit());
	    
		SelectHotelpage hotel = new SelectHotelpage();
		
		click(hotel.button());
		click(hotel.okay());
		
		BookHotelPage book = new BookHotelPage();
		
		type(book.firstName(),pop("firstName"));
		type(book.lastName(),pop("lastName"));
		type(book.address(),pop("address"));
		type(book.ccNum(),pop("ccNum"));
		byValue(book.ccType(),pop("ccType"));
		byValue(book.ccMon(),pop("ccMon"));
		byValue(book.ccYear(),pop("ccYear"));
     	type(book.cvvNum(),pop("cvvNum"));
		click(book.bookNow());
		System.out.println(book.ordNum().getAttribute("value"));
		closeBrowser();
		
	}

	


}






