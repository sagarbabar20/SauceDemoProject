package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;


public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	
		@Test
		public void VerifyLoginFunctionality() throws IOException
		{
 
		ScreenshotClass.takeScreenshot(driver);
		
		log.info("Apply the validation");

        String expectedTitle="Swag Labs";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle,actualTitle);
		}
		
			}


