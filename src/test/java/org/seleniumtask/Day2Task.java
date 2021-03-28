package org.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Task {

	@Test(enabled=false)
	private void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("abc123@gmail.com");

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("password");
		Thread.sleep(2000);
		driver.close();

	}

	@Test(enabled=false)
	private void tc2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Madurai");
		Thread.sleep(2000);
		driver.close();

	}
	@Test(enabled=false)
	private void tc3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Greens Technology"+Keys.ENTER);
		
		driver.close();

	}
	
	@Test(enabled=false)
	private void tc4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement txtUserid = driver.findElement(By.id("DUMMY1"));
		txtUserid.sendKeys("12345");
		WebElement btnArrow = driver.findElement(By.id("user-id-goahead"));
		btnArrow.click();
		WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
			txtpassword.sendKeys("password"); 
			
		driver.close();

		
	}
	@Test(enabled=false)
	private void tc5() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/ ");
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//frameset[@rows='*']"));
		WebElement frame2 = driver.findElement(By.xpath("//frameset[@rows='*,30']"));
		driver.switchTo().frame(0);
	driver.switchTo().frame(1);
		WebElement txtUsername = driver.findElement(By.name("fldLoginUserId"));
		txtUsername.sendKeys("12345678910");

		
	}
	
	@Test(enabled=false)
	private void tc6() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement txtLoc = driver.findElement(By.id("location"));
		txtLoc.sendKeys("Perumbakkam");
		WebElement btnFindFood = driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
		btnFindFood.click();
		
	}
	
	@Test(enabled=false)
	private void tc7() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement txtname = driver.findElement(By.id("userName"));
		txtname.sendKeys("9994848099");
	
	}
	
	@Test(enabled=false)
	private void tc8() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		Thread.sleep(3000);
		WebElement txtInsta = driver.findElement(By.name("username"));
		txtInsta.sendKeys("jeeva");
		
		
		WebElement txtinspass = driver.findElement(By.name("password"));
			txtinspass.sendKeys("Madurai"); 

	}
	
	@Test(enabled=false)
	private void tc9()  {
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
	
	
	}
	@Test(enabled=false)
	private void tc10()  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement txtUserName = driver.findElement(By.name("username"));
	txtUserName.sendKeys("renurenu");
	WebElement txtPassword = driver.findElement(By.name("password"));
	txtPassword.sendKeys("renurenu");
	driver.findElement(By.xpath("//input[@id='login']")).click();
	
	}
	
	
	
}
