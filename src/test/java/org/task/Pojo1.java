package org.task;

import java.awt.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends Base{
	
	public Pojo1() {
	PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id="email")
private WebElement txtmail;

@FindBy(id="pass")
private WebElement txtpass;
@FindBy(name="login")
private WebElement btnLogin;



public WebElement getTxtpass() {
	return txtpass;
}



public WebElement getBtnLogin() {
	return btnLogin;
}



public WebElement getTxtmail() {
	return txtmail;
}

}
