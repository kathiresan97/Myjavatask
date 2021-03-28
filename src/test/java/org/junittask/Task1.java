package org.junittask;

import java.util.List;

import org.base.Base;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends Base{
@BeforeClass
public static void openBrowser() {
	launchBrowser("chrome");
	
}

@Test
public void tc1() {
	driver.get("https://www.facebook.com/");
	WebElement txtEmail = driver.findElement(By.id("email"));
	WebElement txtpass = driver.findElement(By.id("pass"));
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	
	txtEmail.sendKeys("kathi");
	String attribute = txtEmail.getAttribute("value");
	Assert.assertEquals("check id","kathi",attribute);
	txtpass.sendKeys("kathi@123");
	String attribute2 = txtpass.getAttribute("value");
	Assert.assertTrue("check password", attribute2.equals("kathi@123"));
	btnLogin.click();
	
}
}
