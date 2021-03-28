package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task1 extends Base {
	@BeforeClass
	private void openBrowser() {
		Base.launchBrowser("chrome");
	}

	@AfterClass
	private void close() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
	}

	@AfterMethod
	private void closeTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test(enabled=false)
	private void tc1() {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
	}

	@Test(enabled=false)
	private void tc2() {
		
//		HARDASSERT
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("123456790");
		String attribute = driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(attribute, "123456790", "check the email id");
		
		
		boolean password = driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertTrue(password,"password box is not visible");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		String attribute1 = driver.findElement(By.id("pass")).getAttribute("value");
		Assert.assertEquals(attribute1, "12346","check ur password");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getCurrentUrl());

	}

	
	@Test
	private void tc3() throws InterruptedException {
		
//		SOFTASSERT
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SoftAssert s = new SoftAssert();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("849354981");
		String attribute = txtEmail.getAttribute("value");
		s.assertEquals(attribute, "123456790", "check the email id");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("123456");
		String attribute1 = txtPass.getAttribute("value");
		s.assertEquals(attribute1, "12346","check ur password");
		
		s.assertAll();
		driver.findElement(By.name("login")).click();
	}

}
