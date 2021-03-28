package org.testng;

import org.base.Base;
import org.testng.annotations.Test;

public class B extends Base {

	@Test(groups="smoke")
	private void tc1() {
		launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		FBPojo fp = new FBPojo();
		fp.getTxtEmail().sendKeys("java");
		fp.getTxtPass().sendKeys("java@123");
		fp.getBtnLogin().click();
	}
	
	@Test(groups="sanity")
	private void tc2() {
		launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		FBPojo fp = new FBPojo();
		fp.getTxtEmail().sendKeys("selenium");
		fp.getTxtPass().sendKeys("selenium@123");
		fp.getBtnLogin().click();

	}
	
	@Test(groups="regression")
	private void tc3() {
		launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		FBPojo fp = new FBPojo();
		fp.getTxtEmail().sendKeys("kathir");
		fp.getTxtPass().sendKeys("kathir@123");
		fp.getBtnLogin().click();
	}
	
}
