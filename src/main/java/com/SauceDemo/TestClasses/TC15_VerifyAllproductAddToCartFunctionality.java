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

public class TC15_VerifyAllproductAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void VerifyAllproductAddToCartFunctionality() throws IOException
	{
		HomePOMClass hp=new HomePOMClass(driver);
		
		hp.clickonAllproduct();
		log.info("clicked on all product");
		
		ScreenshotClass.takeScreenshot(driver);

		log.info("apply the validation");
		
		String expectedText="6";
		
		String actualText=hp.getTextFromAllproductAddToCart();
		log.info("Actual product is-->"+actualText);
		
		Assert.assertEquals(actualText, expectedText);
			}
	
	

}
