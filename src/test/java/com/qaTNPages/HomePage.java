package com.qaTNPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopAndNotebookDropdown;
	
	@FindBy(linkText = "Show AllLaptops & Notebooks")
	private WebElement selectOptionAlllaptops;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void laptopDropdown() {
		laptopAndNotebookDropdown.click();
	}
	public ProductPage alllaptopsoption() {
		selectOptionAlllaptops.click();
		return new ProductPage(driver) ;
		
	}
}

