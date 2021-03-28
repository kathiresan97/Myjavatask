package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1Pojo extends Base {
	public Task1Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtMail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtMail() {
		return txtMail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
