package com.ebanking.master;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base 

{
	  Library Lb=new Library();
 
  @BeforeTest
  public void beforeTest() 
  {
  Lb.Adminlgn("Admin","Testing@");
  }

  @AfterTest
  public void afterTest() 
  {
  Lb.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() 
  {
  Lb.OpenApp("http://122.175.8.158/ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  Lb.Appc();
  }

}
