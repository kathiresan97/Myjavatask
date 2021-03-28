package org.seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Task {
	WebDriver driver;

	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test(enabled=false)
	private void tc1() throws AWTException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("email");

		Actions a = new Actions(driver);
		a.doubleClick(txtEmail).perform();
		// a.contextClick(txtEmail).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	@Test(enabled=false)
	private void tc2() throws AWTException {
		driver.get(" https://www.google.co.in/webhp ");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("VelMurugan");
		
		Actions a = new Actions(driver);
		a.doubleClick(txtSearch).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
	
	}
	
	@Test(enabled=false)
	private void tc3() throws AWTException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement questionsTab = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		Actions a = new Actions(driver);
		a.click(questionsTab).perform();
		Thread.sleep(3000);
		
		WebElement ctsTab = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		a.contextClick(ctsTab).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@Test(enabled=false)
	private void tc4() throws InterruptedException, AWTException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement frameworkTab = driver.findElement(By.id("heading304"));
		Actions a = new Actions(driver);
		a.contextClick(frameworkTab).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		for (int i = 0; i < 8; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
		Thread.sleep(3000);
		Thread.sleep(3000);
		
	}
	@Test(enabled=false)
	private void tc5() throws AWTException, InterruptedException {

		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement modelresumeTab = driver.findElement(By.id("heading201"));
		Actions a = new Actions(driver);
		a.doubleClick(modelresumeTab).perform();
		
		WebElement modelresume4Tab = driver.findElement(By.xpath("//a[text()='Resume Model-4 '] "));
		a.contextClick(modelresume4Tab).perform();
		
		Robot r = new Robot();
		for (int i = 0; i <4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
	}
	@Test(enabled=false)
	private void tc6() throws AWTException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement rpaTab = driver.findElement(By.xpath("//a[@title='RPA Training in chennai']"));
		Actions a = new Actions(driver);
		a.contextClick(rpaTab).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test(enabled=false)
	private void tc7() throws AWTException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement seleniumtestTab = driver.findElement(By.id("heading303"));
		Actions a = new Actions(driver);
		a.click(seleniumtestTab).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		WebElement day6Questions = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		a.moveToElement(day6Questions).perform();
		a.contextClick(day6Questions).perform();
		
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	@Test(enabled=false)
	private void tc8() throws AWTException, InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtEmail.sendKeys("kathir");
		
		Actions a = new Actions(driver);
		a.doubleClick(txtEmail).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	}
	@Test(enabled=false)
	private void tc9() throws AWTException, InterruptedException {
		driver.get("http://www.amazon.in/");
		
		WebElement signinTab = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		a.moveToElement(signinTab).perform();
		
		WebElement signupTab = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		a.moveToElement(signupTab).perform();
		signupTab.click();
		Thread.sleep(3000);
		
		WebElement txtName = driver.findElement(By.xpath("//input[@tabindex='1']"));
		txtName.sendKeys("kathir");
		Thread.sleep(2000);
		a.doubleClick(txtName).perform();
		Thread.sleep(2000);
		a.contextClick(txtName).perform();;
		Thread.sleep(2000);

		
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	@Test(enabled=false)
	private void tc10() throws AWTException, InterruptedException {
		driver.get("https://www.snapdeal.com/offers/");
		Thread.sleep(3000);
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		searchBar.sendKeys("iphone 7 pro back cover black");
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchBtn.click();
		Thread.sleep(4000);
		WebElement mobileCover = driver.findElement(By.xpath("//a[@pogid='684779925967']"));
		Actions a = new Actions(driver);
		a.moveToElement(mobileCover).perform();
		a.contextClick(mobileCover).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		}
	@Test(enabled=true)
	private void tc11() throws AWTException, InterruptedException {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		WebElement txtProdut = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		txtProdut.sendKeys("iphone");

		WebElement tap = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		tap.click();
		Thread.sleep(5000);
		WebElement dealofdayFirst = driver.findElement(By.xpath("//img[@alt='Apple iPhone 11 (Black, 64 GB)']"));
		Actions a = new Actions(driver);
		a.moveToElement(dealofdayFirst).perform();
		a.contextClick(dealofdayFirst).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}
