package org.myproject;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutDetails extends Base{
	public CheckoutDetails() {
PageFactory.initElements(driver, this);	
}

	@FindBy(xpath="//span[text()='Checkout']")
	private WebElement btnCheckout;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="full_name")
	private WebElement txtName;
	
	@FindBy(id="phone")
	private WebElement txtPhone;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement btnContinue;
	
	@FindBy(id="company_name")
	private WebElement txtBussName;
	
	@FindBy(id="address")
	private WebElement txtAddressStreet;
	
	@FindBy(id="address2")
	private WebElement txtAddress2ndLine;
	
	@FindBy(id="address_postcode")
	private WebElement txtSuburbPostcode;
	
	
	
//=============getters======================
	
	public WebElement getBtnCheckout() {
		return btnCheckout;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtBussName() {
		return txtBussName;
	}

	public WebElement getTxtAddressStreet() {
		return txtAddressStreet;
	}

	public WebElement getTxtAddress2ndLine() {
		return txtAddress2ndLine;
	}

	public WebElement getTxtSuburbPostcode() {
		return txtSuburbPostcode;
	}
	
	
	
}
