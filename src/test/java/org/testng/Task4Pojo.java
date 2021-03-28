package org.testng;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task4Pojo extends Base {
public Task4Pojo() {
PageFactory.initElements(driver, this);
}


@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement txtEmailSign;

@FindBy(xpath="//input[@type='password']")
private WebElement txtPassSign;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement btnLoginSign;

public WebElement getTxtEmailSign() {
	return txtEmailSign;
}

public WebElement getTxtPassSign() {
	return txtPassSign;
}

public WebElement getBtnLoginSign() {
	return btnLoginSign;
}



}
