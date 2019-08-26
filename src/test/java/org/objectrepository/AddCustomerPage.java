package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[text()='Done'])[1]")
	private WebElement doneButton;
	
	@FindBy(id="fname")
	private WebElement firstName;
	
	@FindBy(id="lname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(id="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement submitButton;

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	

}
