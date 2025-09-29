package com.swaglab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username=By.id("user-name");
	public WebElement username()
	{
		return driver.findElement(username);
	}
	By password=By.name("password");
			
			public WebElement password()
			{
				return driver.findElement(password);
			}
	By loginbtn=By.id("login-button");
			public WebElement loginbtn()
			{
		return driver.findElement(loginbtn);
		
			}
}
