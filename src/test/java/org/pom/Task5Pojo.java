package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task5Pojo extends Base {
	public Task5Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
//	=====================================================
	
	@FindBy(id="location")
	private WebElement dpdnLocation;
	
	@FindBy(id="hotels")
	private WebElement dpdnHotels;
	
	@FindBy(id="room_type")
	private WebElement dpdnRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement dpdnRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement txtInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dpdnAdultNo;
	
	@FindBy(id="child_room")
	private WebElement dpdnChildNo;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getDpdnLocation() {
		return dpdnLocation;
	}

	public WebElement getDpdnHotels() {
		return dpdnHotels;
	}

	public WebElement getDpdnRoomtype() {
		return dpdnRoomtype;
	}

	public WebElement getDpdnRoomNo() {
		return dpdnRoomNo;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtOutDate() {
		return txtOutDate;
	}

	public WebElement getDpdnAdultNo() {
		return dpdnAdultNo;
	}

	public WebElement getDpdnChildNo() {
		return dpdnChildNo;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
//	==================================================
	
	@FindBy(id="radiobutton_0")
	private WebElement radioSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadioSelect() {
		return radioSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
//	=====================================================
	
	@FindBy(id="first_name")
	private WebElement txtFirstame;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement dpdnCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dpdnExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dpdnExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvvNo;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstame() {
		return txtFirstame;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getDpdnCardType() {
		return dpdnCardType;
	}

	public WebElement getDpdnExpiryMonth() {
		return dpdnExpiryMonth;
	}

	public WebElement getDpdnExpiryYear() {
		return dpdnExpiryYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
//	==========================================
	
	@FindBy(id="order_no")
	private WebElement txtOrderNo;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
}
