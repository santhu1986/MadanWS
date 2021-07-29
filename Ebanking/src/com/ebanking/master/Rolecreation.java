package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{

	//Element Properties
	
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rty;
	
	@FindBy(xpath=".//*[@id='btninsert']")
	WebElement Sub;
	
	public void Rcre(String Rn,String RT) 
	{
	Rname.sendKeys(Rn);
	Select Rt=new Select(Rty);
	Rt.selectByVisibleText(RT);
	Sub.click();
	}
}
