package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyProject extends Base {

	@BeforeClass
	private void openBrowser() {
		// TODO Auto-generated method stub
		Base.launchBrowser("chrome");
		driver.manage().window().maximize();
	}
	@Test(enabled=false)
	private void tc2() {
		driver.get("https://www.kogan.com/au/");
		Scanner s = new Scanner(System.in);
		String sc = s.next();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		HomePojo hp = new HomePojo();
		hp.getBtnclosead().click();
		hp.getBtnSignInOrUp().click();

		SignInPojo sp = new SignInPojo();
		sp.getTxtEmail().sendKeys("kathir");
		sp.getTxtPass().sendKeys("123456789");
		sp.getBtnSignIn().click();
	}

	@Test
	private void tc1() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		driver.get("https://www.kogan.com/au/");
		
		Scanner s = new Scanner(System.in);
		String sc = s.next();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		HomePojo hp = new HomePojo();
		
//		if (hp.getBtnclosead().isDisplayed()) {
			hp.getBtnclosead().click();
//		}
		
		hp.getTxtSearchBox().sendKeys("apple iphone x" + Keys.ENTER);
		ProductPojo p = new ProductPojo();
	
		// p.getBtnIphoneX().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", p.getBtnIphoneX());
		
		CartPojo c = new CartPojo();
		c.getBtnCart().click();

		c.getBtnViewCart().click();

		CheckoutDetails cd = new CheckoutDetails();
		cd.getBtnCheckout().click();
		cd.getTxtEmail().sendKeys("democlass@gmail.com");
		cd.getTxtName().sendKeys("broce");
		cd.getTxtPhone().sendKeys("8489354876");
	
		cd.getBtnContinue().click();
//		cd.getBtxtBussName().sendKeys("brouce Don");
		js.executeScript("arguments[0].setAttribute('value','brouce don')", cd.getTxtBussName());
		cd.getTxtAddressStreet().sendKeys("parkers road");
		Select sl1 = new Select(cd.getTxtAddressStreet());
		sl1.selectByIndex(1);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		
		cd.getTxtSuburbPostcode().sendKeys("6041");
		Select sl2 = new Select(cd.getTxtSuburbPostcode());
		sl2.selectByIndex(1);
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		cd.getBtnContinue().click();

	}
}
