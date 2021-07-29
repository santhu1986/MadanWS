package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid
{
	
	DesiredCapabilities Cap;
	@Parameters("Browser")
    @Test
	public void Gd(String Br) throws MalformedURLException, InterruptedException 
	{
		
		if (Br.equalsIgnoreCase("firefox"))
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("firefox");
			Cap.setPlatform(Platform.WINDOWS);
				
		}
		
		else if (Br.equalsIgnoreCase("chrome"))
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("chrome");
			Cap.setPlatform(Platform.WINDOWS);
				
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.44.1:4444/wd/hub"),Cap);
		
		
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.login();
		
		//Role
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		//New Role
		
		Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
		RD.Newrol();
		
		//Role Creation
		
		Rolecreation Rc=PageFactory.initElements(driver,Rolecreation.class);
		Rc.Rcre("Tellervb","E");
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
