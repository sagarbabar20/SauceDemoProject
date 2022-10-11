package com.SauceDemo.TestClasses;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPOMClass;
import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;


public class TC04_VerifyCartPage_ContinueShoppingbuttonFunctionality extends TestBaseClass
{

	@Test
	public void VerifyCartPageContinueShoppingbuttonFunctionality() throws IOException
	{
        HomePOMClass a=new HomePOMClass(driver);
		
		a.Clickonsaucelabsbackpack();
		log.info("Clicked on sauce labs back pack ");

		a.getTextFromAddToCart();
		log.info("Clicked on basket ");

		CartPOMClass b=new CartPOMClass(driver);
		b.clickonContinueshoppingbutton();
        
		ScreenshotClass.takeScreenshot(driver);

		log.info("Apply the validation");
		
	    String expectedTitle="Swag Labs";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

		}


