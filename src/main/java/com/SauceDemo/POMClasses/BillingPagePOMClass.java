package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagePOMClass 
{
private WebDriver driver;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement Cancelbutton;
	
	public void ClickonCancelbutton()
	{
		Cancelbutton.click();
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement FinishButton;
	
	public void ClickonFinishButton()
	{
		FinishButton.click();
	}
	
	public BillingPagePOMClass(WebDriver driver)
	{
	 this.driver=driver;
	 
	PageFactory.initElements(driver,this);
	}


}
