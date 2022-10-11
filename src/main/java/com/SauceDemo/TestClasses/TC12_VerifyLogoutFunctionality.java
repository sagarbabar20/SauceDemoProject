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

public class TC12_VerifyLogoutFunctionality extends TestBaseClass
{
	
	@Test(priority=1)
	public void VerifyLogoutbuttonFunctionality() throws IOException
	{
		HomePOMClass y=new HomePOMClass(driver);
		
		y.Clickonmenubutton();
		log.info("clicked on menu button");
		
		ScreenshotClass.takeScreenshot(driver);

		y.clickonLogoutbutton();
		log.info("clicked on logout button");
		
		ScreenshotClass.takeScreenshot(driver);

		log.info("apply the validation");
		 String expectedTitle="Swag Labs";
			
			String actualTitle=driver.getTitle();
			
			Assert.assertEquals(actualTitle, expectedTitle);

	}

	

}
