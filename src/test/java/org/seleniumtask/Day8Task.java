package org.seleniumtask;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task {
	WebDriver driver;
	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test(enabled=false)
	private void tc1() throws AWTException, IOException {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	@Test(enabled=false)
	private void tc2() throws AWTException, IOException {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	@Test(enabled=false)
	private void tc3() throws AWTException, IOException {
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("kathir");
		System.out.println(a.getText());
		a.accept();


	}
	@Test(enabled=false)
	private void tc4() throws AWTException, IOException {
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement element = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(element);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("greens");
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("greens@123");
		driver.findElement(By.xpath("//img[@src='/gif/login_new1.gif']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	@Test(enabled=false)
	private void tc5() throws AWTException, IOException {
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	@Test(enabled=false)
	private void tc6() throws AWTException, IOException {
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.id("Button2")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	@Test(enabled=false)
	private void tc7() throws AWTException, IOException {
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		WebElement img = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(img);
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		}
	@Test(enabled=true)
	private void tc8() throws AWTException, IOException, InterruptedException {
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.findElement(By.xpath("//input[@name='DUMMY1']")).sendKeys("greens");
		driver.findElement(By.id("user-id-goahead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("greentech");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("123456");
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		
	}
	
		
		
		
		
	
	
}
