package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
	    Library LB=new Library();
		
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.Adminlgn("Admin","Testing@");
		
		//To get the Excel File
		
		FileInputStream Fis=new FileInputStream("E:\\MadanProject\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	
		//Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row count
		
		int Rc=WS.getLastRowNum();
	    System.out.println(Rc);
	    
	    //Multiple Iterartions------ LOOP
	    
	    for (int i=1;i<=Rc;i++) 
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
	    	
	    	String Rval=LB.Role(Rname,Rty);
	    	System.out.println(Rval);
	    	
	    	WC2.setCellValue(Rval);
		}
	    
	    //Results 
	    
	    FileOutputStream Fos=new FileOutputStream("E:\\MadanProject\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
	    WB.write(Fos);
	    WB.close();
	}

}
