package org.pom;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3cPojo extends Base{
	public Task3cPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement btnCourse;
	
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement btnJavaTraining;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement btnCoreJavaTraining;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement btnCarrer;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement btnTestimonial;
	
	@FindBy(xpath="//a[text()='+91 8939 915 577 / +91 6385 149 793']")
	private WebElement textMobileNo;
	
	@FindBy(xpath="(//div[@class='testimonial-section'])[19]")
	private WebElement paraReview;
	
	@FindBy(xpath="//a[text()='contact@greenstechnologys.com']")
	private WebElement textMail;
	
	
	@FindBy(xpath="//p[contains(text(),'I was looking out for institutions to learn An')]")
	private WebElement paraAnithaReview;
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement btnContactUs;
	
	@FindBy(xpath="//h3[@class='title divider-3']")
	private WebElement headContactTitle;
	
	@FindBy(xpath="//p[contains(text(),'Copyrigh')]")
	private WebElement textCopyRights;
	
	public WebElement getBtnCourse() {
		return btnCourse;
	}

	public WebElement getBtnJavaTraining() {
		return btnJavaTraining;
	}

	public WebElement getBtnCoreJavaTraining() {
		return btnCoreJavaTraining;
	}

	public WebElement getParaAnithaReview() {
		return paraAnithaReview;
	}

	public WebElement getBtnCarrer() {
		return btnCarrer;
	}

	public WebElement getTextMail() {
		return textMail;
	}

	public WebElement getBtnTestimonial() {
		return btnTestimonial;
	}

	public WebElement getTextMobileNo() {
		return textMobileNo;
	}

	public WebElement getParaReview() {
		return paraReview;
	}

	public WebElement getBtnContactUs() {
		return btnContactUs;
	}

	public WebElement getHeadContactTitle() {
		return headContactTitle;
	}

	public WebElement getTextCopyRights() {
		return textCopyRights;
	}
	
}
