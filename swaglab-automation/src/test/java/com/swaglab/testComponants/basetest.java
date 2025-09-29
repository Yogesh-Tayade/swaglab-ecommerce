package com.swaglab.testComponants;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.readDatafrompropertiesfile;

public class basetest {

	//globaly create the obj of externalfile 
	
	public WebDriver driver;

	readDatafrompropertiesfile read=new readDatafrompropertiesfile();
	public String baseurl=read.getApplicationUrl();
	public String username=read.getusernam();
	public String password=read.getpassword();
	
	@BeforeTest
	public WebDriver setupMethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
}
