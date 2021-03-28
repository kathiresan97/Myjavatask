package org.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonProjt extends Base{

	
	
	@Test
	private void tc1() {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in");
AmazonHomePojo ap = new AmazonHomePojo();		
		ap.getTxtSearchBox().sendKeys("iphone");
		String attribute = ap.getTxtSearchBox().getAttribute("value");
		Assert.assertEquals(attribute, "phone","check the search item");
		ap.getBtnSearchClick().click();
		

	}
	
	
	
	
		
	
}
