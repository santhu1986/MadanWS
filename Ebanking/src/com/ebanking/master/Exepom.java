package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	WebDriver driver;
	
    @BeforeTest
	public void login() throws InterruptedException 
	{
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://122.175.8.158/ranford2");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.login();
	
	}
	@Test
    public void Rolecre() throws InterruptedException, IOException
    
    {
		
	//To get the Excel File
		
		FileInputStream Fis=new FileInputStream("E:\\MadanProject\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	
		//Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row count
		
		int Rcount=WS.getLastRowNum();
	    System.out.println(Rcount);
	    
	    //Multiple Iterartions------ LOOP
	    
	    for (int i=1;i<=Rcount;i++) 
	    {
			//Row
	    	
	    	XSSFRow WR=WS.getRow(i);
	    	
	    	//Cell
	    	
	    	XSSFCell WC=WR.getCell(0);
	    	XSSFCell WC1=WR.getCell(1);
	    	
	    	XSSFCell WC2=WR.createCell(2);
	    	
	    	//Cell Values
	    	
	    	String Rname=WC.getStringCellValue();
	    	String Rty=WC1.getStringCellValue();
	    	
	
	//Role
	
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Rol();
	
	//New Role
	
	Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
	RD.Newrol();
	
	//Role Creation
	
	Rolecreation Rc=PageFactory.initElements(driver,Rolecreation.class);
	Rc.Rcre(Rname,Rty);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	RD.Hom();
	Thread.sleep(3000);
    }
	
    }
	}

