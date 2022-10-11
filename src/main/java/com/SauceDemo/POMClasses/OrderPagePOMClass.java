package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backhomebutton;
	
	public void Clickonbackhomebutton()
	{
		backhomebutton.click();
	}
	
	public OrderPagePOMClass(WebDriver driver)
	{
	 this.driver=driver;
	 
	PageFactory.initElements(driver,this);
	}

}
