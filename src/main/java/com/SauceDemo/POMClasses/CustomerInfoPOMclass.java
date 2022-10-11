package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPOMclass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement Fname;
	
	public void SendFname()
	{
		Fname.sendKeys("Sagar");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Lname;
	
	public void SendLname()
	{
		Lname.sendKeys("Babar");
	}

	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Zipcode;
	
	public void SendZipcode()
	{
		Zipcode.sendKeys("413307");
	}

	@FindBy(xpath="//button[@id='cancel']")
	WebElement cancelbutton;
	
	public void Clickoncancelbutton()
	{
		cancelbutton.click();
	}

	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebutton;
	
	public void Clickoncontinuebutton()
	{
		continuebutton.click();
	}

	public CustomerInfoPOMclass(WebDriver driver)
	{
	 this.driver=driver;
	 
	PageFactory.initElements(driver,this);
	}
}
