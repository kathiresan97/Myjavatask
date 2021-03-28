package org.junittask;

import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Task2 extends Base{
	@BeforeClass
	public static void openBrowser() {
		launchBrowser("chrome");
		
	}

	@Test
	public void tc1() {
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
	WebElement btnSignInUp = driver.findElement(By.id("signin-block"));
	btnSignInUp.click();
	WebElement btnSignIn = driver.findElement(By.id("signInLink"));
	btnSignIn.click();
	WebDriverWait w = new WebDriverWait(driver, 30);
	
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(frame1);
	w.until(ExpectedConditions.elementToBeClickable(By.id("mobileNoInp")));
	WebElement txtMobileNo = driver.findElement(By.id("mobileNoInp"));
	txtMobileNo.sendKeys("9876543210");
	
	String mobileNo = txtMobileNo.getAttribute("value");
	Assert.assertEquals(mobileNo, "9876543210", "check mobile number");
	
	
	
	}
}
