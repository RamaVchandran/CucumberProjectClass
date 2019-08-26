package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary{
	// static WebDriver driver;
	
	@Before
	public void beforeBackground() {
		
		launchUrl("http://demo.guru99.com/telecom/");
		

	}
	
	@After
	public void afterScenario() {
	
		
		driver.quit();

	}

}
