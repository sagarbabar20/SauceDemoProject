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
import com.SauceDemo.POMClasses.CustomerInfoPOMclass;
import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC08_VerifyCustomerPage_ContinueButtonFunctionality extends TestBaseClass
{
		
	@Test
	public void VerifyCustomerPage_ContinueButtonFunctionality() throws InterruptedException, IOException
	{
		HomePOMClass a=new HomePOMClass(driver);
		a.Clickonsaucelabsbackpack();
		log.info("Clicked on saucelabs back pack");

		a.getTextFromAddToCart();
		log.info("clicked add to cart");

		CartPOMClass b=new CartPOMClass(driver);
		
		b.clickonCheckoutbutton();
		log.info("Clicked on checkout button");

		CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
	    c.SendFname();
	    log.info("First name is entered");

	    c.SendLname();
	    log.info("Last name is entered");

	    c.SendZipcode();
	    log.info("Zipcode is entered");
		
		ScreenshotClass.takeScreenshot(driver);

		c.Clickoncontinuebutton();
		log.info("Clicked on continue button");

		ScreenshotClass.takeScreenshot(driver);

		log.info("Apply the validation");
		
	    String expectedTitle="Swag Labs";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
}
