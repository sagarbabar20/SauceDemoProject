package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPOMClass
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement Continueshoppingbutton;
	
	public void clickonContinueshoppingbutton()
	{
		Continueshoppingbutton.click();
	}

	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removetab;
	
	public void clickonremovetab()
	{
		removetab.click();
	}

	@FindBy(xpath="//button[@id='checkout']")
	private WebElement Checkoutbutton;
	
	public void clickonCheckoutbutton()
	{
		Checkoutbutton.click();
	}

	public CartPOMClass(WebDriver driver)
	{
	 this.driver=driver;
	 
	PageFactory.initElements(driver,this);
	}
}
