package org.seleniumtask;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day12Task {
	WebDriver driver;

	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test(enabled = false)
	private void tc1() throws AWTException, IOException {
		driver.get("http://www.greenstechnologys.com/");

		WebElement intPhoneno = driver
				.findElement(By.xpath("(//span[text()='+91- 89399 15577 / +91 6385 149 793'])[4]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", intPhoneno);

		WebElement addressPorur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		String porur = addressPorur.getText();
		System.out.println(porur);

	}

	@Test(enabled = true)
	private void tc2() throws Exception {
		driver.get("http://toolsqa.com/");
		Thread.sleep(30000);

		WebElement popAdd = driver.findElement(By.xpath("//img[@alt='Close']"));
		popAdd.click();
		Thread.sleep(3000);

		WebElement pageBottom = driver.findElement(By.xpath("//span[text()='Hari Haran – IND (Exp 3 Yrs)']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pageBottom);

		WebElement pageTop = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(false)", pageTop);

	}

	@Test(enabled = false)
	private void tc3() throws Exception {
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement scrollTest = driver.findElement(By.xpath("//div[@data-target='#collapse301']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTest);
	}

	@Test(enabled = false)
	private void tc4() throws Exception {
		driver.get("https://www.facebook.com/");

		WebElement txtUser = driver.findElement(By.id("email"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		WebElement btnLogin = driver.findElement(By.id("u_0_b"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','greens')", txtUser);
		js.executeScript("arguments[0].setAttribute('value','greens')", txtPass);
		js.executeScript("arguments[0].click()", btnLogin);

	}

	@Test(enabled = false)
	private void tc5() throws Exception {
		driver.get("http://adactinhotelapp.com/");

		WebElement txtUser = driver.findElement(By.id("username"));
		WebElement txtPass = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','greens')", txtUser);
		js.executeScript("arguments[0].setAttribute('value','greens@123')", txtPass);
		js.executeScript("arguments[0].click()", btnLogin);
	}

	@Test(enabled = false)
	private void tc6() throws Exception {
		driver.get(" https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Login']")).click();

		WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement txtPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','9095787511')", txtUser);
		js.executeScript("arguments[0].setAttribute('value','greens@123')", txtPass);
		// js.executeScript("arguments[0].click()", btnLogin);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		String s = (String) executeScript;
		System.out.println(s);

		Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", txtPass);
		String s1 = (String) executeScript2;
		System.out.println(s1);
	}

}
