package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	//1.driver declared
	private WebDriver driver;
	private Actions act;

	
	//2.element find
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	//3.create a method as per action on ele
	//and add action in that method

	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Loginbutton;
	
	public void clickonLoginbutton()
//	{
//		Loginbutton.click();
//	}
	
	{
//		Actions act=new Actions(driver);
		act.click(Loginbutton).perform();
	}
	//4.create a constructor
	
	public LoginPOMClass(WebDriver driver)
	{
		//global     local
		this.driver=driver;
		
		//selenium class
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	
	
	    //POM Class steps
		//1.WebDriver driver declare
		//2.ele find by @FindBy Annotation
		//3.created a method to perform a action on element
		//4.Constructor create

	
	

}
