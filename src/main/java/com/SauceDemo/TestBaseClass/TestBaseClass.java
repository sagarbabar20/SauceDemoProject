package com.SauceDemo.TestBaseClass;

import java.io.IOException;



import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TestBaseClass
{
    public WebDriver driver;
    protected Logger log= Logger.getLogger("SauceDemoProject");
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName)  
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
        }
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		LoginPOMClass x=new LoginPOMClass(driver);
		
		x.sendusername();
		log.info("username is entered");
		
		x.sendpassword();
		log.info("password is entered");
		
		x.clickonLoginbutton();
		log.info("clicked on login button");
		}
	
	@AfterMethod
	public void tearDown()  
	{
	driver.close();
	log.info("Browser is Closed");
	}

}
