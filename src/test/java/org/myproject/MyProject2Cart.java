package org.myproject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MyProject2Cart extends Base {

	@Test
	private void tc1() {
		launchBrowser("chrome");
		driver.get("https://www.kogan.com/au/");
		driver.manage().window().maximize();
		Scanner s = new Scanner(System.in);
		String sc = s.next();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		HomePojo hp = new HomePojo();
		hp.getBtnclosead().click();
		hp.getTxtSearchBox().sendKeys("mi tv");
		hp.getBtnSearchBtn().click();

		ProductPojo pp = new ProductPojo();
		pp.getBtnMiTvStick().click();
		
		CartPojo cp = new CartPojo();
		cp.getBtnCart().click();
		
		hp.getBtnHome().click();
		
		hp.getTxtSearchBox().sendKeys("apple iphone x" + Keys.ENTER);
		ProductPojo p = new ProductPojo();
		
		// p.getBtnIphoneX().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", p.getBtnIphoneX());
	
		
		cp.getBtnCart().click();

		
	}
}
