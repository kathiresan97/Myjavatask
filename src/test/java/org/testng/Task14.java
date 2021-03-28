package org.testng;

import org.base.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task14 extends Base {

	@BeforeClass
	private void openBrowser() {
		launchBrowser("chrome");

	}
	@Parameters({"mail","pass"})
	@Test
	private void tc1(String mail,String pass) {
		driver.get("https://mail.google.com/");
		
		Task14Pojo tp = new Task14Pojo();
		tp.getTxtMailBox().sendKeys(mail);
		tp.getBtnNext().click();
		tp.getTxtPassBox().sendKeys(pass);
		tp.getBtnNext().click();

	}
	
	
	
	
	
	
	
	
	
	@DataProvider(name="Authentication")
	private Object[][] tc2(){
		return new Object[][] {
			{"kathiresan","12345679"},
			{"kathiresanmk97@gmail.com","976543210"},
			{"kathiresanmk97@gmail.com","kahuhyewhjf"}};
		}
		
	}
	

