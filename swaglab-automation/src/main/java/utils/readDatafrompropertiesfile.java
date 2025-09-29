package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readDatafrompropertiesfile {

	Properties prop;
	public readDatafrompropertiesfile()
	{
		// create the constructor to write a code for the dada read
		FileReader file=null;
		try {
			 file=new FileReader("D:/Automation/swaglab-automation/configuration/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getApplicationUrl()
	{
		String baseurl=prop.getProperty("baseurl");
		return baseurl;
		
	}
	public String getusernam()
	{
		String username=prop.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	
}
