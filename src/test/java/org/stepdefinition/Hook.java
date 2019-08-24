package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	 static WebDriver driver;
	
	@Before
	public void beforeBackground() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\cucumber\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");

	}
	
	@After
	public void afterScenario() {
	
		
		driver.quit();

	}

}
