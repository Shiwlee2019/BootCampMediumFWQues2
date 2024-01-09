package com.qaTNPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
public WebDriver driver;
	
	@FindBy(linkText = "MacBook Air")
	private WebElement selectProduct;
	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void selectproductOption() {
		selectProduct.click();
	}
	

}


