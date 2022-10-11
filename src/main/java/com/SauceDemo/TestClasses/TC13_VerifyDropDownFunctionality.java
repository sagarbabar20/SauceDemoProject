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

public class TC13_VerifyDropDownFunctionality extends TestBaseClass
{
	@Test
	public void VerifyDropDownFunctionality() throws IOException
	{
		HomePOMClass dp=new HomePOMClass(driver);
		dp.DropDownFilter();
		log.info("clicked on drop down filter");
		
		ScreenshotClass.takeScreenshot(driver);

		log.info("Apply Validation");
		
		String expectedText="Price (low to high)";
		
		String actualText=dp.DropDownFilter();
		System.out.println(actualText);
		
		Assert.assertEquals(actualText, expectedText);

		
				}
		
	
}
