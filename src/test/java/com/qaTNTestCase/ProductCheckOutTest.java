package com.qaTNTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaTNPages.CheckOutPage;
import com.qaTNPages.HomePage;
import com.qaTNPages.ProductInfoPage;
import com.qaTNPages.ProductPage;
import com.qaTNPages.ShoppingCartPage;

public class ProductCheckOutTest {
	public WebDriver driver;
	public HomePage homepage;
	public ProductPage productpage;
	public ShoppingCartPage shoppingcartpage;
	public CheckOutPage checkoutpage;
	public ProductInfoPage productinfopage;

	
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	    homepage = new HomePage(driver);
		homepage.laptopDropdown();
		productpage  = homepage.alllaptopsoption();
	
	}
	@Test
	public void checkoutProduct() throws Exception {
		productinfopage = new ProductInfoPage(driver);
		shoppingcartpage = new  ShoppingCartPage(driver);
	    productpage.selectproductOption();
		productinfopage.clickOnAddToCart();
		shoppingcartpage.continueToShoppingCart();
		checkoutpage = shoppingcartpage.checkoutOption();
		checkoutpage.clickOnCheckout();
		checkoutpage.emailfield();
		checkoutpage.passwordField();
		checkoutpage.loginButton();
		checkoutpage.newAddressRadioButton();
		checkoutpage.firstNamefield();
		checkoutpage.lastNameField();
		checkoutpage.addressfield();
		checkoutpage.cityField();
		checkoutpage.postcodeField();
		Select select = new Select(driver.findElement(By.id("input-payment-country")));
    	select.selectByVisibleText("United States");
    	
    	Select select1 = new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
    	select1.selectByVisibleText("Michigan");
        checkoutpage.continueButtonAddress();
    	checkoutpage.continueButtonShipping();
    	checkoutpage.continueButtonShippingmethod();
    	checkoutpage.termsAndConditionButton();
    	checkoutpage.continueButtonPaymentMethod();
    	checkoutpage.confirmOrder();
    	Assert.assertTrue(checkoutpage.orderSucessMessage());
    	
    
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
		}
}