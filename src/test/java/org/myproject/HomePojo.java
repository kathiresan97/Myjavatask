package org.myproject;

import org.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends Base {
public HomePojo() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@class='main-menu__user__wrapper']")
private WebElement btnSignInOrUp;

@FindBy(id="product-search-field")
private WebElement txtSearchBox;

@FindBy(xpath="//button[@type='submit']")
private WebElement btnSearchBtn;

@FindBy(xpath="//img[@class='logo']")
private WebElement btnHome;

@FindBy(xpath="//div[@class='_1ASHj']")
private WebElement btnclosead;



//=============getters======================

public WebElement getTxtSearchBox() {
	return txtSearchBox;
}

public WebElement getBtnSearchBtn() {
	return btnSearchBtn;
}

public WebElement getBtnHome() {
	return btnHome;
}

public WebElement getBtnclosead() {
	return btnclosead;
}

public WebElement getBtnSignInOrUp() {
	return btnSignInOrUp;
}



}
