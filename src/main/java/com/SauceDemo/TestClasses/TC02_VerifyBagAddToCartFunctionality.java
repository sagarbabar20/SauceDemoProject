package com.SauceDemo.TestClasses;

import java.io.IOException;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC02_VerifyBagAddToCartFunctionality extends TestBaseClass
{
		
	@Test
	public void VerifyBagAddToCartFunctionality() throws IOException
	{

	HomePOMClass a=new HomePOMClass(driver);
	
	a.Clickonsaucelabsbackpack();
	log.info("Clicked on sauce labs back pack ");
	ScreenshotClass.takeScreenshot(driver);

	String expectedProduct="1";
	
	String ActualProduct=a.getTextFromAddToCart();
	log.info("actual product is-->"+ActualProduct);
	
	ScreenshotClass.takeScreenshot(driver);

	log.info("Apply the validation");
		
	Assert.assertEquals(ActualProduct, expectedProduct);
	
	}
	
	}
