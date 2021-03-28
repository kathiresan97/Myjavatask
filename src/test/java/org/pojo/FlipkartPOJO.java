package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPOJO extends Base {
	
	public FlipkartPOJO() {
PageFactory.initElements(driver, this);
}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtSignEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtSignPass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnSignSubmit;

	public WebElement getTxtSignEmail() {
		return txtSignEmail;
	}

	public WebElement getTxtSignPass() {
		return txtSignPass;
	}

	public WebElement getBtnSignSubmit() {
		return btnSignSubmit;
	}
	
	
}
