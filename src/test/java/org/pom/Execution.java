package org.pom;

import org.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Execution extends Base {
	
	
public static void main(String[] args) throws InterruptedException {

	Execution t = new Execution();
	t.task5();
	
}

private void task1() {
	launchBrowser("chrome");
driver.get("https://www.facebook.com/");
	
	Task1Pojo t1 = new Task1Pojo();
	t1.getTxtMail().sendKeys("kathir");
	t1.getTxtpass().sendKeys("95175");
	t1.getBtnLogin().click();

}
private void task2() {
	launchBrowser("chrome");
	driver.get("https://demoqa.com/registration/");

}
private void task3a() {
	launchBrowser("chrome");
	driver.get("http://www.greenstechnologys.com/");
	Task3Pojo t3 = new Task3Pojo();
	
	Base.scrollDown(t3.getHeadGreensCentre());
	String greensCentre = t3.getHeadGreensCentre().getText();
	System.out.println(greensCentre);
	
	Base.scrollUp(t3.getHeadGreensNo1());
	System.out.println(t3.getHeadGreensNo1().getText());
	
	
}
private void task3b() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("http://www.greenstechnologys.com/");
	Task3Pojo t3 = new Task3Pojo();
	t3.getBtnCertification().click();
	t3.getLinkCourseContent().click();
	Thread.sleep(3000);
	//t3.getBtnClose().click();
	System.out.println(t3.getParaTestimonial().getText());
	System.out.println(t3.getHeadSelenium().getText());

}
private void task3c() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("http://www.greenstechnologys.com/");
	Task3cPojo t3c = new Task3cPojo();
	// note3
	elementMove(t3c.getBtnCourse());
	elementMove(t3c.getBtnJavaTraining());
	t3c.getBtnCoreJavaTraining().click();
	scrollDown(t3c.getParaAnithaReview());
	System.out.println(t3c.getParaAnithaReview().getText());
	
	//note 4
	t3c.getBtnCarrer().click();
	scrollDown(t3c.getTextMail());
	System.out.println(t3c.getTextMail().getText());
	
	driver.navigate().back();
	Thread.sleep(2000);
	//note 5
	t3c.getBtnTestimonial().click();
	System.out.println(t3c.getTextMobileNo().getText());
	System.out.println(t3c.getParaReview().getText());
	
	driver.navigate().back();
	// note6
	t3c.getBtnContactUs().click();
	String contactTitle = t3c.getHeadContactTitle().getText();
	System.out.println(contactTitle);
	
	scrollDown(t3c.getTextCopyRights());
	System.out.println(t3c.getTextCopyRights().getText());
	
}
private void task5() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("http://www.adactin.com/HotelApp/");
	Task5Pojo t5 = new Task5Pojo();
	Thread.sleep(2000);
	t5.getTxtUsername().sendKeys("renurenu");
	t5.getTxtPassword().sendKeys("renurenu");
	t5.getBtnLogin().click();
	
	intSelect(t5.getDpdnLocation(), 2);
	intSelect(t5.getDpdnHotels(), 2);
	intSelect(t5.getDpdnRoomtype(), 2);
	intSelect(t5.getDpdnRoomNo(), 2);
	intSelect(t5.getDpdnAdultNo(), 2);
	intSelect(t5.getDpdnChildNo(), 2);
	
//	js.executeScript("arguments[0].setAttribute('value','28/1/2021')",t5.getTxtInDate());
//	
//	js.executeScript("arguments[0].setAttribute('value','29/1/2021')",t5.getTxtOutDate());
//	
	t5.getBtnSearch().click();
	
	t5.getRadioSelect().click();
	t5.getBtnContinue().click();
	
	
	t5.getTxtFirstame().sendKeys("kathir");
	t5.getTxtLastName().sendKeys("m");
	t5.getTxtAddress().sendKeys("omr");
	t5.getTxtCreditCardNo().sendKeys("1475296374123654");
	intSelect(t5.getDpdnCardType(), 2);
	textSelect(t5.getDpdnExpiryMonth(), "August");
	t5.textSelect(t5.getDpdnExpiryYear(), "2022");
	t5.getTxtCvvNo().sendKeys("425");
	t5.getBtnBookNow().click();
	
	WebDriverWait w = new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(t5.getTxtOrderNo()));
	
	String orderNo = t5.getTxtOrderNo().getAttribute("value");
	System.out.println(orderNo);
	
}
}
