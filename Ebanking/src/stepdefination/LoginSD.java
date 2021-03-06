package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

	WebDriver driver;
	

@Given("^User Should on Ranford home Page$")
public void user_Should_on_Ranford_home_Page() throws Throwable
{
	driver=new FirefoxDriver();
	
	//maximise
	
	driver.manage().window().maximize();
	
	//URL
	
	driver.get("http://122.175.8.158/ranford2");
	
}

@When("^User Enters \"(.*)\" and \"(.*)\"$")
public void user_Enters_username_Password(String Un,String Pwd) throws Throwable 
{

	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
    driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    	
}

@Then("^User Validates Admin Login$")
public void user_Validates_Admin_Login() throws Throwable 
{
	String Expval="Welcome to Admin";
	
	String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comparision
	
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Admin Login Succ");	
			}
			else
			{
				System.out.println("Admin Login Failed");
			}
	
}

@When("^User Close the Application$")
public void user_Close_the_Application() throws Throwable 
{
   driver.close();
}

}
