package org.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3Task {
	
	@Test(enabled=false)
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone");
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();
	}
	@Test(enabled=false)
	private void tc2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("abc123@gmail.com");

		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpass.sendKeys("password");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		Thread.sleep(2000);
//		driver.close();

	}
	@Test(enabled=false)
	private void tc3()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement txtFName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	txtFName.sendKeys("Kathiresan");
	WebElement txtLName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	txtLName.sendKeys("M");
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	txtAddress.sendKeys("Room no:D2,/nSri lakshmi narayana mens pg,/nnavalur.");
	WebElement txtmailbox = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	txtmailbox.sendKeys("kathiresan@gmail.com");
	WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	txtPhone.sendKeys("7978978978");
	WebElement radioGendreMale = driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));
	radioGendreMale.click();
	WebElement chkBoxMovies = driver.findElement(By.id("checkbox2"));
	chkBoxMovies.click();
	}
	
	@Test(enabled=false)
	private void tc4()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	WebElement txtFirstName = driver.findElement(By.id("firstName"));
	txtFirstName.sendKeys("kathir");
	WebElement txtLastName = driver.findElement(By.id("lastName"));
	txtLastName.sendKeys("m");
	WebElement txtEmail = driver.findElement(By.id("userEmail"));
	txtEmail.sendKeys("kathir@gmail.com");
	WebElement radioMale = driver.findElement(By.xpath("//label[text()='Male']"));
	radioMale.click();
	WebElement txtMobileNo = driver.findElement(By.id("userNumber"));
	txtMobileNo.sendKeys("12345679");
	WebElement txtSubject = driver.findElement(By.id("subjectsContainer"));
	txtSubject.sendKeys("maths");
	
	
	}
	@Test(enabled=false)
	private void tc5()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement btnInterviewQus = driver.findElement(By.id("heading20"));
	btnInterviewQus.click();
	WebElement btnCtsInterviewQus = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	btnCtsInterviewQus.click();
	}
	
	@Test(enabled=false)
	private void tc6()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement btnSignIn = driver.findElement(By.id("sign-in-icon-down"));
	btnSignIn.click();
	WebElement btnSignInLink = driver.findElement(By.id("signInLink"));
	btnSignInLink.click();
	WebElement txtMobile = driver.findElement(By.id("mobileNoInp"));
	txtMobile.sendKeys("12345679");
	}
	
	@Test(enabled=false)
	private void tc7()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	WebElement txtFrom = driver.findElement(By.id("from_station"));
	txtFrom.sendKeys("chennai");
	WebElement txtTo = driver.findElement(By.id("to_station"));
	txtTo.sendKeys("tirunelveli");
	WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
	btnSearch.click();
	}
	
	@Test(enabled=false)
	private void tc8()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement btnModelResume = driver.findElement(By.xpath("//div[@class='card-header11 d-flex align-items-center justify-content-between']"));
	btnModelResume.click();
	
	WebElement btnModelResume1 = driver.findElement(By.xpath("(//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf'])"));
	btnModelResume1.click();
	
	
	}
	
	@Test(enabled=false)
	private void tc9()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	WebElement txtmail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	txtmail.sendKeys("kathir");
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
	txtpass.sendKeys("kathir@123");
	
	
	}
	@Test(enabled=false)
	private void tc10()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");

	WebElement txtSearchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtSearchBox.sendKeys("iphone");

	driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	txtSearchBox.click();
	
	
	}
	
	@Test(enabled=false)
	private void tc11()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	WebElement txtFirstName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
	txtFirstName.sendKeys("kathir");
	WebElement txtLastName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[2]"));
	txtLastName.sendKeys("m");
	WebElement txtUserName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[3]"));
	txtUserName.sendKeys("kathir97");
	WebElement txtPass = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[4]"));
	txtPass.sendKeys("kathir@123");
	WebElement txtConfirmPass = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[5]"));
	txtConfirmPass.sendKeys("kathir@123");
	
	
	}
	@Test(enabled=false)
	private void tc12() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement btnSignUp = driver.findElement(By.xpath("//div[@class='accountInner']"));
	btnSignUp.click();
	WebElement btnLogin = driver.findElement(By.xpath("//a[text()='login']"));
	btnLogin.click();
	Thread.sleep(4000);
	WebElement frame = driver.findElement(By.id("loginIframe"));
	driver.switchTo().frame(0);
	Thread.sleep(4000);
	WebElement txtMobileNo = driver.findElement(By.id("userName"));
	txtMobileNo.sendKeys("976543210");
	WebElement btnContinue = driver.findElement(By.id("checkUser"));
	btnContinue.click();
	
	}
	
	@Test(enabled=false)
	private void tc13() {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	txtPhoneNo.sendKeys("9876543210");
	WebElement btnCountinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	btnCountinue.click();

	}
	
	@Test(enabled=true)
	private void tc14() {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement btnSignup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	btnSignup.click();
	WebElement txtPhoneNo = driver.findElement(By.xpath("(//input[@tabindex='1'])[2]"));
	txtPhoneNo.sendKeys("9876123456");
	WebElement txtName = driver.findElement(By.xpath("(//input[@tabindex='2'])"));
	txtName.sendKeys("kathir");
	WebElement txtEmail = driver.findElement(By.xpath("(//input[@tabindex='3'])"));
	txtEmail.sendKeys("kathir97");
	WebElement txtPassword = driver.findElement(By.xpath("(//input[@tabindex='4'])"));
	txtPassword.sendKeys("kathir@123");
	WebElement btnContinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
	btnContinue.click();
	
	}
}
