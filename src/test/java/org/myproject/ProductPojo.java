package org.myproject;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPojo extends Base {
	public ProductPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[contains(text(),'Used as Demo ')]")
	private WebElement btnIphoneX;

@FindBy(xpath="//a[text()=' Stick [ With Google Assistant]']")
private WebElement BtnMiTvStick;
	
	
	//=============getters======================
	
	public WebElement getBtnIphoneX() {
		return btnIphoneX;
	}


	public WebElement getBtnMiTvStick() {
		return BtnMiTvStick;
	}
}
