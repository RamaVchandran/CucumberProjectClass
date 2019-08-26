package org.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public static void launchUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\cucumber\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
		

	}
	
	public static void insertValue(WebElement element,String name) {
		// TODO Auto-generated method stub
		
		element.sendKeys(name);

	}
	
	public static void button(WebElement element) {
		// TODO Auto-generated method stub
		
		element.click();

	}

}
