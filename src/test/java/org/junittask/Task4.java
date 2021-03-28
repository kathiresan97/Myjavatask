package org.junittask;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

public class Task4 extends Base{
@BeforeClass
public static void openBrowser() {
	launchBrowser("chrome");
	
}
@Test
public void tc1() {
	driver.get("https://www.flipkart.com/account/login");
	driver.manage().window().maximize();
	
	Task4Pojo t4=new Task4Pojo();
	t4.getTxtEmail().sendKeys("9876543210");
	String attribute = t4.getTxtEmail().getAttribute("value");
	
	Assert.assertEquals(attribute, "9876543210", "check mail");
	
	t4.getTxtPass().sendKeys("kathir98765");
	String attribute2 = t4.getTxtPass().getAttribute("value");
	
	Assert.assertEquals(attribute2, "kathir98765", "check pass");
	t4.getBtnLogIn().click();
}
}
