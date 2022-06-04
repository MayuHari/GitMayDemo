package com.execution;

import java.io.IOException;

import org.junit.Test;

import com.withoutpagefactory.LoginPageOs;


public class ExecutionClassOs extends LoginPageOs {
	
//@Test
	public void orangeHrm() throws IOException {
		browserlaunch();
		url(pop("url"));
		LoginPageOs login = new LoginPageOs();
		type(login.Username(),pop("Username"));
		type(login.Password(),pop("Password"));
		click(login.submit());
		closeBrowser();	
	}	
}
