package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class MyProjectSignIn extends Base {
	
	
	@Test(enabled=false)
	private void tc1() throws AWTException {
		Base.launchBrowser("chrome");
		driver.get("https://www.kogan.com/au/");
		Scanner s = new Scanner(System.in);
		String sc = s.next();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Robot r = new Robot();
		HomePojo hp = new HomePojo();
		hp.getBtnclosead().click();
		hp.getBtnSignInOrUp().click();

		SignInPojo sp = new SignInPojo();
		sp.getTxtEmail().sendKeys("kathir");
		sp.getTxtPass().sendKeys("123456789");
		sp.getBtnSignIn().click();
	
	
	}
	@Test
	private void tc2() throws IOException {
		Base.launchBrowser("chrome");
		driver.get("https://www.kogan.com/au/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\Downloads\\download\\notcomp.png");
		FileUtils.copyFile(src, dest);
	}

}
