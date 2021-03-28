package org.junittask;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task4Pojo extends Base {
public Task4Pojo() {
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement txtEmail;

@FindBy(xpath="//input[@type='password']")
private WebElement txtPass;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement btnLogIn;


//==========================================================

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogIn() {
	return btnLogIn;
}


}
