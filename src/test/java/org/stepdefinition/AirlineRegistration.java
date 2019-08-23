package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AirlineRegistration {
	static WebDriver driver;
	@Given("User should be in Airline homepage")
	public void user_should_be_in_Airline_homepage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\cucumber\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	    
	}

	@Given("User should click Register button")
	public void user_should_click_Register_button() {
	    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@When("User enter the valid details")
	public void user_enter_the_valid_details() {
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arun");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("92568394");
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rama@gmail.com");
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Tambaram");
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("tamilnadu");
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600065");
	    WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
	    Select s = new Select(ele);
	    s.selectByVisibleText("ALGERIA ");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ram");
	    driver.findElement((By.xpath("//input[@name='password']"))).sendKeys("ram145");
	
	}
	

	@When("User enter the valid details.")
	public void user_enter_the_valid_details(DataTable data) {
		List<String> datas = data.asList(String.class);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(datas.get(0));
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(datas.get(1));
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(datas.get(1));
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(datas.get(3));
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(datas.get(4));
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(datas.get(5));
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(datas.get(6));
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(datas.get(7));
	    WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
	    Select s = new Select(ele);
	    s.selectByVisibleText("ALGERIA ");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get(8));
	    driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(datas.get(9));
	    
	}
	
	@When("User enter the valid detail")
	public void user_enter_the_valid_detail(DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(datas.get("fname"));
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(datas.get("lname"));
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(datas.get("phno"));
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(datas.get("email"));
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(datas.get("address"));
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(datas.get("chennai"));
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(datas.get("tamilnadu"));
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(datas.get("pincode"));
	    WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
	    Select s = new Select(ele);
	    s.selectByVisibleText("ALGERIA ");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get("password"));
	    driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(datas.get("confirm"));
	        
	}
	
	@When("User enter the valid detail{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_valid_detail(String fname, String lname, String phno, String email, String address, String city, String state, String pincode, String password, String confirm) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname); 
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phno);
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pincode);
	    WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
	    Select s = new Select(ele);
	    s.selectByVisibleText("ALGERIA ");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(password);
	    driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(confirm);
		
	}
	
	
	@When("User should click the Submit button")
	public void user_should_click_the_Submit_button() {
		 driver.findElement(By.xpath("//input[@name='register']")).click();
	}

	@Then("User should get displayed with Your user name is")
	public void user_should_get_displayed_with_Your_user_name_is() {
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Your user name')]")).isDisplayed());
			 
	}

}
