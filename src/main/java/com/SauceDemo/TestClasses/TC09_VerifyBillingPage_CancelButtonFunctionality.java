package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.BillingPagePOMClass;
import com.SauceDemo.POMClasses.CartPOMClass;
import com.SauceDemo.POMClasses.CustomerInfoPOMclass;
import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC09_VerifyBillingPage_CancelButtonFunctionality extends TestBaseClass
{
	@Test
	public void VerifyBillingPage_CancelButtonFunctionality() throws IOException
	{
		HomePOMClass a=new HomePOMClass(driver);
		a.Clickonsaucelabsbackpack();
		log.info("Clicked on saucelabs back pack");

		a.getTextFromAddToCart();
		log.info("Clicked on basket");
		
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
		
		c.Clickoncontinuebutton();
		log.info("Clicked on continue button");
		
		ScreenshotClass.takeScreenshot(driver);

		BillingPagePOMClass d=new BillingPagePOMClass(driver);
		
		d.ClickonCancelbutton();
		log.info("Clicked on cancel button");

		ScreenshotClass.takeScreenshot(driver);

		log.info("Apply the validation");
		
	    String expectedTitle="Swag Labs";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
}