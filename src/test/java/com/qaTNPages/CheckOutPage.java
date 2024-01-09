package com.qaTNPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
public WebDriver driver;
	
	@FindBy(linkText= "Checkout")
	private WebElement clickCheckOut;
	
	@FindBy(xpath= "//input[@id='input-email']")
	private WebElement enterEmailAddress;	
	
	@FindBy(id = "input-password")
	private WebElement enterPassword;
	
	@FindBy(id = "button-login")
	private WebElement ClickOnLogin;
	
	@FindBy (xpath = "//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/label[1]/input[1]")
	private WebElement useANewaddressButton;
	
	@FindBy(id = "input-payment-firstname")
	private WebElement enterFirstName;
	
	@FindBy(id = "input-payment-lastname")
	private WebElement enterlastname;
	
	@FindBy(id = "input-payment-address-1")
	private WebElement enterAddress1;
	
	@FindBy(id = "input-payment-city")
	private WebElement enterCity;
	
	@FindBy(id = "input-payment-postcode")
	private WebElement enterPostCode;
	
	
	
	@FindBy(id = "button-payment-address")
	private WebElement clickOnOnContinueAddress;
	
	@FindBy(id = "button-shipping-address")
	private WebElement clcikOnContinueButtonShipping;
	
	@FindBy(id = "button-shipping-method")
	private WebElement clcikOnContinueButtonShippingMethod;
	

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement termsAndCondition;
	
	@FindBy(xpath = "//input[@id='button-payment-method']")
	private WebElement clickOnContinueButtonPaymentMethod;
	
	@FindBy(xpath = "//input[@id='button-confirm']")
	private WebElement clickOnConfirmOrder;
	
	@FindBy(xpath = "//h1[contains(text(),'Your order has been placed!')]")
	private WebElement orderPlacedmessage;
	
	
	
	
   public CheckOutPage(WebDriver driver) {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
	   
	}
	public void clickOnCheckout() { 
		 clickCheckOut.click();
		
	}
	public void emailfield() {
		enterEmailAddress.sendKeys("Shiwlee2011@gmail.com");
	}
	public void passwordField() {
		enterPassword.sendKeys("Rima2022");
	}
	public void loginButton() {
		ClickOnLogin.click();
	}
	public void newAddressRadioButton() {
		useANewaddressButton.click();
	}
	public void firstNamefield() {
		enterFirstName.sendKeys("Shiwlee");
		
	}
	public void lastNameField() {
		enterlastname.sendKeys("Rahman");
		
	}
	public void addressfield() {
		enterAddress1.sendKeys("13830 BathGate");
	}
	public void cityField() {
		enterCity.sendKeys("Michigan");
	}
	public void postcodeField() {
		enterPostCode.sendKeys("48312");
		
	}
	public void selectCountry() {
	
	}
	
	
	public void continueButtonAddress() {
		clickOnOnContinueAddress.click();
	}
	public void continueButtonShipping() {
		clcikOnContinueButtonShipping.click();
	}
	public void continueButtonShippingmethod() {
		clcikOnContinueButtonShippingMethod.click();
	}
	public void termsAndConditionButton() {
		termsAndCondition.click();
	}
	public void continueButtonPaymentMethod() {
		clickOnContinueButtonPaymentMethod.click();
	}
	public void confirmOrder() {
		clickOnConfirmOrder.click();
	}
	public boolean orderSucessMessage() {
		return orderPlacedmessage.isDisplayed();
		
	}
		
	}


