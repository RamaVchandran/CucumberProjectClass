package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps  {
	
	//
	
	@Given("user should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
		
	//	System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\cucumber\\Driver\\chromedriver.exe");
		// driver=new ChromeDriver();
	//	driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		
		Hook.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
		
	   
	}

	@When("user enters all the fields")
	public void user_enters_all_the_fields() {
		
		Hook.driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys("karthi");
		Hook.driver.findElement(By.id("lname")).sendKeys("rajan");
		Hook.driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		Hook.driver.findElement(By.name("addr")).sendKeys("tanjore");
		Hook.driver.findElement(By.id("telephoneno")).sendKeys("123456778");
	
	    
	}
	
	@When("user enters all the fields.")
	public void user_enters_all_the_fields(DataTable cusDatas) {
		
		List<String> datas = cusDatas.asList(String.class);
		
		Hook.driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		Hook.driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		Hook.driver.findElement(By.id("email")).sendKeys(datas.get(2));
		Hook.driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));

	}
	@When("user enters all the field")
	public void user_enters_all_the_field(DataTable dataTable) {
		
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		Hook.driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		Hook.driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		Hook.driver.findElement(By.id("email")).sendKeys(datas.get("email"));
		Hook.driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
	 
	}
	
	@When("user enters all the fields{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String a, String b, String c, String d, String e) {
		
		Hook.driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(a);
		Hook.driver.findElement(By.id("lname")).sendKeys(b);
		Hook.driver.findElement(By.id("email")).sendKeys(c);
		Hook.driver.findElement(By.name("addr")).sendKeys(d);
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(e);
	  
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		Hook.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	  
	}

	@Then("user should be displayed the customer id is generated")
	public void user_should_be_displayed_the_customer_id_is_generated() {
		
		Assert.assertTrue(Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	 
	}
	
	

}
