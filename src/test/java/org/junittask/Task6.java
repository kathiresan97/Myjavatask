package org.junittask;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.Task5Pojo;

public class Task6 extends Base {
	@BeforeClass
	public static void openBrowser() {
		launchBrowser("chrome");
		
	}
	@Test
	public void tc1() {
		driver.get("http://www.adactin.com/HotelApp/");
		Task6Pojo t6 = new Task6Pojo();
	WebDriverWait w = new WebDriverWait(driver, 20);
		t6.getTxtUsername().sendKeys("renurenu");
		t6.getTxtPassword().sendKeys("renurenu");
		t6.getBtnLogin().click();
		
		intSelect(t6.getDpdnLocation(), 2);
		intSelect(t6.getDpdnHotels(), 2);
		intSelect(t6.getDpdnRoomtype(), 2);
		intSelect(t6.getDpdnRoomNo(), 2);
		intSelect(t6.getDpdnAdultNo(), 2);
		intSelect(t6.getDpdnChildNo(), 2);
		
		t6.getBtnSearch().click();
		
		t6.getRadioSelect().click();
		t6.getBtnContinue().click();
		
		
		t6.getTxtFirstame().sendKeys("kathir");
		t6.getTxtLastName().sendKeys("m");
		t6.getTxtAddress().sendKeys("omr");
		t6.getTxtCreditCardNo().sendKeys("1475296374123654");
		intSelect(t6.getDpdnCardType(), 2);
		textSelect(t6.getDpdnExpiryMonth(), "August");
		t6.textSelect(t6.getDpdnExpiryYear(), "2022");
		t6.getTxtCvvNo().sendKeys("425");
		t6.getBtnBookNow().click();
		
		
		w.until(ExpectedConditions.visibilityOf(t6.getTxtOrderNo()));
		
		String orderNo = t6.getTxtOrderNo().getAttribute("value");
		System.out.println(orderNo);

	
	}
}
