package org.testng;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task14Pojo extends Base {
	public Task14Pojo() {

PageFactory.initElements(driver, this);
	}
	@FindBy(id="identifierId")
	private WebElement txtMailBox;
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement btnNext;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassBox;

	public WebElement getTxtMailBox() {
		return txtMailBox;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getTxtPassBox() {
		return txtPassBox;
	}
	
	
}
