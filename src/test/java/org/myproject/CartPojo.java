package org.myproject;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPojo extends Base {
public CartPojo() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[text()='Add to Cart']")
private WebElement btnCart;

@FindBy(xpath="(//button[text()='Continue Shopping'])[2]")
private WebElement btnCtnShop;

@FindBy(xpath="//button[@class='_3t33I _1v6X8 _1x8rE fullWidth notouch']")
private WebElement btnViewCart;


//=============getters======================

public WebElement getBtnCart() {
	return btnCart;
}


public WebElement getBtnCtnShop() {
	return btnCtnShop;
}


public WebElement getBtnViewCart() {
	return btnViewCart;
}




}
