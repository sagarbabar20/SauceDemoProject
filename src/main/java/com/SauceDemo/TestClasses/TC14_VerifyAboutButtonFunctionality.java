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

public class TC14_VerifyAboutButtonFunctionality extends TestBaseClass
{
	@Test
	public void VerifyAboutButtonFunctionality() throws IOException
	{
		HomePOMClass ab=new HomePOMClass(driver);
		
		ab.Clickonmenubutton();
		log.info("Clicked on menu botton");
		
		ScreenshotClass.takeScreenshot(driver);

		ab.ClickAboutButton();
		log.info("Clicked on about botton");
		
		ScreenshotClass.takeScreenshot(driver);

		log.info("apply validation");
		
		String expectedTitle="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		
		String ActualTitle=driver.getTitle();
        System.out.println(ActualTitle);
        
		Assert.assertEquals(ActualTitle, expectedTitle);
        }
	
}
