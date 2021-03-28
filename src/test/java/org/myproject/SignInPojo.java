package org.myproject;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends Base {
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id="input-loginbox-email")
	private WebElement txtEmail;
	
	@FindBy(id="input-loginbox-password")
	private WebElement txtPass;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement btnSignIn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
	
	
	
	
}
