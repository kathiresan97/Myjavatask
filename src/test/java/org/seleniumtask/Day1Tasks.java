package org.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Tasks {
	
	@Test
	private void tc1() throws InterruptedException {
		WebDriverManager.iedriver().setup();
		WebDriver d=new InternetExplorerDriver();
//		d.get("http://www.greenstechnologys.com/");
//		Thread.sleep(2000);
//		d.get("http://demo.automationtesting.in/Register.html");
//		Thread.sleep(2000);
//		d.get("http://www.greenstechnologys.com/");
//		Thread.sleep(2000);
		d.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		d.close();

	}
	
	@Test(enabled=false)
	private void tc2() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	Thread.sleep(2000);
	d.get("http://gmail.com/");
	Thread.sleep(2000);
	d.get("http://www.flipkart.com/");
	Thread.sleep(2000);
	d.get("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	d.close();

	}

}
