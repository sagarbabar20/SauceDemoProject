package com.SauceDemo.POMClasses;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void Clickonmenubutton()
	{
		menubutton.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	
	public void clickonLogoutbutton()
	{
		logoutbutton.click();
	}
	

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement saucelabsbackpack;
	
	public void Clickonsaucelabsbackpack()
	{
		saucelabsbackpack.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement AddToCart;
	
	public String getTextFromAddToCart()
	{
		AddToCart.click();
		String totalproduct=AddToCart.getText();
		return totalproduct;
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement DropDown;
	
	public String DropDownFilter()
	{
		DropDown.click();
		s.selectByVisibleText("Price (low to high)");
		
		String FilterText=DropDown.getText();
		return FilterText;
		
	}

	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement AboutButton;
	
	public void ClickAboutButton()
	{
		AboutButton.click();
	}

	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> Allproduct;
	
	public void clickonAllproduct()
	{
		for(WebElement i: Allproduct)
		{
			i.click();
			
		}
	}

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement AllproductAddToCart;
	
	public String getTextFromAllproductAddToCart()
	{
		AllproductAddToCart.click();
		String totalproduct=AddToCart.getText();
		return totalproduct;
	}
	
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		s=new Select(DropDown);
	

	}
	
		

}
