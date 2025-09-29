package com.swaglab.tests;

import org.testng.annotations.Test;

import com.swaglab.pages.loginPage;
import com.swaglab.testComponants.basetest;

public class logintest extends basetest{

	@Test
	public void loginByvalidCredential()
	{
		driver.get(baseurl);
		loginPage login=new loginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.loginbtn().click();
		
	}
}
