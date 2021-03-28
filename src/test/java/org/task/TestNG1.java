package org.task;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.FlipkartPOJO;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 extends Base {

	@BeforeClass
	private void openBrowser() {
	launchBrowser("chrome");
	}
 
	@Test(enabled=false)
	public void tc1() {
		// TODO Auto-generated method stub
driver.get("https://www.facebook.com/");

Pojo1 p1=new Pojo1();
p1.getTxtmail().sendKeys("kathiresan");
p1.getTxtpass().sendKeys("password");
Assert.assertTrue(p1.getTxtmail().getAttribute("value").equals("kathiresan"), "mail id is wrong");

Assert.assertTrue(p1.getTxtpass().getAttribute("value").equals("password"), "pass id is wrong");
p1.getBtnLogin().click();

	}
	@Test
	public void tc2() {
		// TODO Auto-generated method stub
driver.get("https://www.flipkart.com/account/login");

 FlipkartPOJO fl=new FlipkartPOJO();

	fl.getTxtSignEmail().sendKeys("kathir");
	
	Assert.assertEquals("kathir", fl.getTxtSignEmail().getAttribute("value"), "mail id is wrong");

	fl.getTxtSignPass().sendKeys("password");
	
	Assert.assertEquals("java", fl.getTxtSignPass().getAttribute("value"), "pass id is wrong");
	fl.getBtnSignSubmit().click();



	}
	
	
}
