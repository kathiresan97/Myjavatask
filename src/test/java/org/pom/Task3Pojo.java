package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3Pojo extends Base {
	public Task3Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//u[contains(text(),'re Training Cent')]")
	private WebElement headGreensCentre;
	
	@FindBy(xpath="//h1[contains(text(),'No 1 Softw')]")
	private WebElement headGreensNo1;
	
	@FindBy(xpath="//a[contains(text(),'Certifications')]")
	private WebElement btnCertification;

	@FindBy(xpath="(//a[contains(text(),'Course Content')])[30]")
	private WebElement linkCourseContent;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement btnClose;
	
	@FindBy(xpath="//p[contains(text(),'I have taken Selenium training in chennai at Greens technology.')]")
	private WebElement paraTestimonial;
	
	@FindBy(xpath="//h2[contains(text(),'Selenium Tr')]")
	private WebElement headSelenium;
	
	
	public WebElement getHeadGreensCentre() {
		return headGreensCentre;
	}

	public WebElement getHeadGreensNo1() {
		return headGreensNo1;
	}

	public WebElement getBtnCertification() {
		return btnCertification;
	}

	public WebElement getLinkCourseContent() {
		return linkCourseContent;
	}

	public WebElement getParaTestimonial() {
		return paraTestimonial;
	}

	public WebElement getHeadSelenium() {
		return headSelenium;
	}

	public WebElement getBtnClose() {
		return btnClose;
	}
	
	
	
	
	
}
