package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args)
	{
	     //Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Admin Login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        
        //Branch Creation
        
        driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
        driver.findElement(By.xpath("//input[@name='BtnNewBR']")).click();
        
        
        //DropDown
        
        Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
        Ctry.selectByVisibleText("INDIA");
        
        //State
        //City
        //Submit
        
        //Alert
        
        driver.switchTo().alert().accept();
        
        //Role Creation
        //Employee Creation
        //Log Out
        //Close App
        
        
        
        
        
        
        

	}

}
