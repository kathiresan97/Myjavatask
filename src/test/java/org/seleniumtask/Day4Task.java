package org.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4Task {

	@Test(enabled=false)
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com ");
		
	System.out.println(driver.findElement(By.xpath("//span[@class='blue_text']")).getText());
	}
	
	@Test(enabled=false)
	private void tc2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com ");

	WebElement para = driver.findElement(By.xpath("//p[contains(text(),'competitive ')]"));
	System.out.println(para.getText());
	}
	
	@Test(enabled=false)
	private void tc3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement addAdayar = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
		String adayar = addAdayar.getText();
		System.out.println(adayar);
	}
	
	@Test(enabled=false)
	private void tc4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement addOmr = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		String Omr = addOmr.getText();
		System.out.println(Omr);

	}
	@Test(enabled=false)
	private void tc6() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("greens");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("123@greens");
	
	String txt = userName.getAttribute("value");
	System.out.println(txt);
	
	String txt1 = password.getAttribute("value");
	System.out.println(txt1);
	
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	
	

	}
	
	@Test(enabled=false)
	private void tc7()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement txtInput = driver.findElement(By.name("q"));
		txtInput.sendKeys("greens velmurugan");
		
		WebElement tap = driver.findElement(By.xpath("//div[@id='lga']"));
		tap.click();
		
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		btnSearch.click();
		
		WebElement linkGreen = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));
		linkGreen.click();
	
	
	
	}
	
	@Test(enabled=false)
	private void tc8()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement userName = driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
		userName.sendKeys("kathir");
		
		String txt = userName.getAttribute("value");
		System.out.println(txt);
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
	    password.sendKeys("kathir123456789");
	    
	    String txt1 = password.getAttribute("value");
		System.out.println(txt1);
		
	}
	@Test(enabled=false)
	private void tc9()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");

		WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		searchBar.sendKeys("iphone");

		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnSearch.click();

		WebElement product = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		product.click();
		
	
	}
	
	@Test(enabled=false)
	private void tc10()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnLoginClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnLoginClose.click();
		WebElement txtProdut = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		txtProdut.sendKeys("greens");

		WebElement tap = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		tap.click();
		
	}
	@Test(enabled=false)
	private void tc11()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement txtName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtName.sendKeys("kathiresan");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("kathiresan@12345");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnLogin.click();
		}
	@Test(enabled=true)
	private void tc12()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");

		WebElement searchBar = driver.findElement(By.xpath("//input[@onkeydown='if(event.keyCode==13) searchTrigger();']"));
		searchBar.sendKeys("iphone");

		WebElement btnSearch = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		btnSearch.click();

		WebElement product = driver.findElement(By.xpath("(//div[@class='column col3 search_blocks'])[1]"));
		product.click();
	
	}
}
