package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.BillingPagePOMClass;
import com.SauceDemo.POMClasses.CartPOMClass;
import com.SauceDemo.POMClasses.CustomerInfoPOMclass;
import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.OrderPagePOMClass;
import com.SauceDemo.TestBaseClass.TestBaseClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC16_VerifyAllFunctionality extends TestBaseClass
{
	@Test
	public void VerifyLoginFunctionality()
	{
    System.out.println("Apply the validation");
    String expectedTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(expectedTitle,actualTitle);
	}
//-------------------------------------------------------------------------
	@Test
	public void VerifyBagAddToCartFunctionality() throws IOException
	{
    HomePOMClass a=new HomePOMClass(driver);
    a.Clickonsaucelabsbackpack();
    System.out.println("Clicked on sauce lab back pack");
	ScreenshotClass.takeScreenshot(driver);
    String expectedProduct="1";
	String ActualProduct=a.getTextFromAddToCart();
	System.out.println("actual product is-->"+ActualProduct);
	ScreenshotClass.takeScreenshot(driver);
    System.out.println("Apply the validation");
	Assert.assertEquals(ActualProduct, expectedProduct);
		}
//----------------------------------------------------------------------------------
	 @Test
		public void VerifyCartPageCheckoutFunctionality() throws IOException 
		{
     HomePOMClass a=new HomePOMClass(driver);
	 a.Clickonsaucelabsbackpack();
	 System.out.println("Clicked on sauce lab back pack");
	 a.getTextFromAddToCart();
	 System.out.println("Clicked on basket");
	 CartPOMClass b=new CartPOMClass(driver);
	 b.clickonCheckoutbutton();
	 System.out.println("Clicked on check out button");
     ScreenshotClass.takeScreenshot(driver);
     System.out.println("Apply the validation");
	 String expectedTitle="Swag Labs";
	 String actualTitle=driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
     }
//----------------------------------------------------------------------------------	 
	 @Test
		public void VerifyCartPageContinueShoppingbuttonFunctionality() throws IOException
		{
	        HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			System.out.println("Clicked on sauce lab back pack");
			a.getTextFromAddToCart();
		    System.out.println("Clicked on basket");
		    CartPOMClass b=new CartPOMClass(driver);
			b.clickonContinueshoppingbutton();
		    System.out.println("Clicked on continue shopping button");
	        ScreenshotClass.takeScreenshot(driver);
            System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
//-------------------------------------------------------------------------------------------
	 @Test
		public void VerifyCartPageRemoveTabFunctionality() throws IOException
		{
		HomePOMClass a=new HomePOMClass(driver);	
		a.Clickonsaucelabsbackpack();
		System.out.println("Clicked on sauce lab back pack");
		a.getTextFromAddToCart();
	    System.out.println("Clicked on basket");
		CartPOMClass b=new CartPOMClass(driver);
		b.clickonremovetab();
	    System.out.println("Clicked on remove tab");
		ScreenshotClass.takeScreenshot(driver);
        System.out.println("Apply the validation");
	    String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
				}
//-------------------------------------------------------------------------------------------	 
	 @Test
		public void VerifyCustomerPage_FillInfoFunctionality() throws InterruptedException, IOException
		{
			HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			System.out.println("Clicked on sauce lab back pack");
			a.getTextFromAddToCart();
		    System.out.println("Clicked on basket");
			CartPOMClass b=new CartPOMClass(driver);
			b.clickonCheckoutbutton();
		    System.out.println("Clicked on check out button");
		    CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
	        c.SendFname();
	        System.out.println("First name is entered");
	        ScreenshotClass.takeScreenshot(driver);
            c.SendLname();
	        System.out.println("Last name is entered");
            ScreenshotClass.takeScreenshot(driver);
            c.SendZipcode();
	        System.out.println("Zipcode is entered");
            ScreenshotClass.takeScreenshot(driver);
            System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
		    String actualTitle=driver.getTitle();
		    Assert.assertEquals(actualTitle, expectedTitle);
		}
//------------------------------------------------------------------------------------------		
	 @Test
	    public void VerifyCustomerInfoPage_cancelFunctionality() throws IOException
	    {
	    	HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			System.out.println("Clicked on sauce lab back pack");
			a.getTextFromAddToCart();
		    System.out.println("Clicked on basket");
			CartPOMClass b=new CartPOMClass(driver);
			b.clickonCheckoutbutton();	
		    System.out.println("Clicked on check out button");
	        CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
	        c.SendFname();
	        System.out.println("First name is entered");
	        c.SendLname();
	        System.out.println("Last name is entered");
	        c.SendZipcode();
	        System.out.println("Zipcode name is entered");
	        c.Clickoncancelbutton();
		    System.out.println("Clicked on Cancel out button");
            ScreenshotClass.takeScreenshot(driver);
            System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
		    String actualTitle=driver.getTitle();
		    Assert.assertEquals(actualTitle, expectedTitle);
	    }
//----------------------------------------------------------------------------------------------	 
	 @Test
		public void VerifyCustomerPage_ContinueButtonFunctionality() throws InterruptedException, IOException
		{
			HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			a.getTextFromAddToCart();
			CartPOMClass b=new CartPOMClass(driver);
			b.clickonCheckoutbutton();
			System.out.println("Clicked on checkout button");
			CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
		    c.SendFname();
		    System.out.println("First name is entered");
		    c.SendLname();
		    System.out.println("Last name is entered");
		    c.SendZipcode();
		    System.out.println("Zipcode is entered");
			ScreenshotClass.takeScreenshot(driver);
			c.Clickoncontinuebutton();
			System.out.println("Clicked on continue button");
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
		}
//--------------------------------------------------------------------------------------------
	 @Test
		public void VerifyBillingPage_CancelButtonFunctionality() throws IOException
		{
			HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			a.getTextFromAddToCart();
			System.out.println("Clicked on basket");
			CartPOMClass b=new CartPOMClass(driver);
	        b.clickonCheckoutbutton();
			System.out.println("Clicked on checkout button");
			CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
		    c.SendFname();
		    System.out.println("First name is entered");
		    c.SendLname();
		    System.out.println("Last name is entered");
		    c.SendZipcode();
		    System.out.println("Zipcode is entered");
			c.Clickoncontinuebutton();
			System.out.println("Clicked on continue button");
			ScreenshotClass.takeScreenshot(driver);
			BillingPagePOMClass d=new BillingPagePOMClass(driver);
			d.ClickonCancelbutton();
			System.out.println("Clicked on cancel button");
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
//--------------------------------------------------------------------------------------------	 
	 @Test
	    public void VerifyBillingPage_FinishButtonFunctionality() throws IOException
	    {
	    	HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			a.getTextFromAddToCart();
			System.out.println("Clicked on basket");
			CartPOMClass b=new CartPOMClass(driver);
			b.clickonCheckoutbutton();
			System.out.println("Clicked on checkout button");
			CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
		    c.SendFname();
		    System.out.println("First name is entered");
		    c.SendLname();
		    System.out.println("Last name is entered");
		    c.SendZipcode();
		    System.out.println("Zipcode is entered");
			c.Clickoncontinuebutton();
			System.out.println("Clicked on continue button");
	        BillingPagePOMClass d=new BillingPagePOMClass(driver);
			d.ClickonFinishButton();
			System.out.println("Clicked on Finish button");
			ScreenshotClass.takeScreenshot(driver);
		System.out.println("Apply the validation");
	    String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		}
//------------------------------------------------------------------------------------	 
	 @Test
		public void VerifyOrderPage_BackToHomeButtonFunctionality() throws IOException
		{
			HomePOMClass a=new HomePOMClass(driver);
			a.Clickonsaucelabsbackpack();
			a.getTextFromAddToCart();
			System.out.println("Clicked on basket");
			CartPOMClass b=new CartPOMClass(driver);
			b.clickonCheckoutbutton();
			System.out.println("Clicked on checkout button");
			CustomerInfoPOMclass c=new CustomerInfoPOMclass(driver);
		    c.SendFname();
		    System.out.println("First name is entered");
		    c.SendLname();
		    System.out.println("Last name is entered");
		    c.SendZipcode();
		    System.out.println("Zipcode is entered");
			c.Clickoncontinuebutton();
			System.out.println("Clicked on continue button");
			BillingPagePOMClass d=new BillingPagePOMClass(driver);
			d.ClickonFinishButton();
			System.out.println("Clicked on Finish button");
			OrderPagePOMClass op=new OrderPagePOMClass(driver);
			op.Clickonbackhomebutton();
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("Apply the validation");
		    String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
         }
//-----------------------------------------------------------------------------------------	 
		@Test
		public void VerifyLogoutbuttonFunctionality() throws IOException
		{
			//home-page
			HomePOMClass y=new HomePOMClass(driver);
			y.Clickonmenubutton();
			System.out.println("clicked on menu button");
			ScreenshotClass.takeScreenshot(driver);
			y.clickonLogoutbutton();
			System.out.println("clicked on logout button");
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("apply the validation");
			String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
         }
//------------------------------------------------------------------------------------------
		@Test
		public void VerifyDropDownFunctionality() throws IOException
		{
			HomePOMClass dp=new HomePOMClass(driver);
			dp.DropDownFilter();
		    System.out.println("Clicked on dropDown");
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("Apply Validation");
			String expectedText="Price (low to high)";
			String actualText=dp.DropDownFilter();
			System.out.println(actualText);
			Assert.assertEquals(actualText, expectedText);
		}
//-----------------------------------------------------------------------------------------		
		@Test
		public void VerifyAboutButtonFunctionality() throws IOException
		{
			HomePOMClass ab=new HomePOMClass(driver);
			ab.Clickonmenubutton();
			System.out.println("Clicked on menu botton");
			ScreenshotClass.takeScreenshot(driver);
			ab.ClickAboutButton();
			System.out.println("Clicked on about botton");
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("apply validation");
			String expectedTitle="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
			String ActualTitle=driver.getTitle();
	        System.out.println(ActualTitle);
			Assert.assertEquals(ActualTitle, expectedTitle);
	        }
//--------------------------------------------------------------------------------------------		
		@Test
		public void VerifyAllproductAddToCartFunctionality() throws IOException
		{
			HomePOMClass hp=new HomePOMClass(driver);
			hp.clickonAllproduct();
			System.out.println("clicked on all product");	
			ScreenshotClass.takeScreenshot(driver);
			System.out.println("apply the validation");	
			String expectedText="6";
			String actualText=hp.getTextFromAllproductAddToCart();
			System.out.println("Actual product is-->"+actualText);
			Assert.assertEquals(actualText, expectedText);
				}

     
	 

}
