package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{
	
	WebDriver driver;
	
	@Given("^Tester Should on Home Page$")
	public void tester_Should_on_Home_Page() throws Throwable 
	{
		driver=new FirefoxDriver();
		
		//maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");

	}

	@When("^Tester enters Username and Password$")
	public void tester_enters_Username_and_Password() throws Throwable 
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
	    driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	    
	}

	@When("^Tester click on Role Button$")
	public void tester_click_on_Role_Button() throws Throwable 
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	
	}

	@Then("^Tester Click on New Role button and Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void tester_Click_on_New_Role_button_and_Enters_and(String Rn,String Rt) throws Throwable 
	{
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(Rn);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		   driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();		
		
	}

	@When("^Tetser Close Application$")
	public void tetser_Close_Application() throws Throwable
	{
	driver.close();
	}


}
