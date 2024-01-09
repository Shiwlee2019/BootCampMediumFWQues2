package com.qaTNPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
public WebDriver driver;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
	private WebElement shoppingCartButton;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement checkOutButton;
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void continueToShoppingCart() {
        shoppingCartButton.click();
		
	}
	public CheckOutPage checkoutOption() {
		checkOutButton.click();
		return new CheckOutPage(driver);
	}
		
	}
	

