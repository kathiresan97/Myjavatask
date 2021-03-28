package org.testng;

import org.base.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task4 extends Base{
	
	
	@Parameters("browser")
	@Test
	private void tc1(@Optional("chrome")String browser) {
		Base.launchBrowser(browser);
driver.get("https://www.flipkart.com/account/login");

	Task4Pojo t = new Task4Pojo();
	t.getTxtEmailSign().sendKeys("kathir");
	String attribute = t.getTxtEmailSign().getAttribute("value");
	
	Assert.assertEquals("kathir", attribute,"check the mobile number");
	
	t.getTxtPassSign().sendKeys("12345679");
	String attribute2 = t.getTxtPassSign().getAttribute("value");
	Assert.assertTrue(attribute2.equalsIgnoreCase("123456789"), "check the password");
	
	t.getBtnLoginSign().click();



	}

}
