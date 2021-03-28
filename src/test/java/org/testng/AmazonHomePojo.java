package org.testng;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePojo extends Base {
	public AmazonHomePojo() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtSearchBox;
	
	
	@FindBy(id="nav-search-submit-button")
	private WebElement btnSearchClick;


	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}


	public WebElement getBtnSearchClick() {
		return btnSearchClick;
	}
	
	
	
	
}
