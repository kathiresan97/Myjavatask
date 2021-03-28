package org.seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10Task {
	
	WebDriver driver;
	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test(enabled=true)
	private void tc1() throws AWTException, InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone XS");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions a  = new Actions(driver);
		WebElement product = driver.findElement(By.xpath("//span[text()='Simple Mobile Carrier-Locked Samsung Galaxy A50 4G LTE Prepaid Smartphone - Black - 64GB - Sim Card Included - GSM']"));
		Thread.sleep(3000);
		
		a.contextClick(product).perform();
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		driver.switchTo().window("CDwindow-9620860C22648CA576EDA6418B9DDB89");
		WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String text = price.getText();
		System.out.println(text);
		driver.close();
	}
	@Test(enabled=false)
	private void tc2() throws AWTException, InterruptedException {
		driver.get("https://www.snapdeal.com/ ");
		
		FluentWait<WebDriver> time = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		time.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputValEnter")));
		
		driver.findElement(By.id("inputValEnter")).click();
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7 bumper case");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.MILLISECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Apple iPhone 7 Bumper Cases Shopizone - Green']")));
		
		driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Bumper Cases Shopizone - Green']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String ans : child) {
			if (!parent.equals(ans)) {
				driver.switchTo().window(ans);
				}
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("add-cart-button-id")).click();
		WebElement pay = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String text = pay.getText();
		System.out.println(text);
	}
	@Test(enabled=false)
	private void tc3() throws AWTException, InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("headerSearch")).sendKeys("celling fan ");
		driver.findElement(By.id("headerSearchButton")).click();
		driver.findElement(By.xpath("(//span[text()='Ashby Park 52 in. White Color Changing Integrated LED Brushed Nickel Ceiling Fan with Light Kit and Remote Control'])[1]")).click();
		
	}
	@Test(enabled=true)
	private void tc4() throws AWTException, InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='×'])[1]")));
		
		driver.findElement(By.xpath("(//span[text()='×'])[1]")).click();
		
		WebElement testPaper = driver.findElement(By.xpath("(//h3[@id='Python-Solutions-Architect-Training'])[4]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", testPaper);
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Test Papers']")));
		boolean enabled = driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[26]")).isEnabled();
		System.out.println(enabled);
		Thread.sleep(10000);
		WebElement seleniumTest = driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[26]"));
		js.executeScript("arguments[0].click()", seleniumTest);
//		seleniumTest.click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String ans : child) {
			if (!parent.equals(ans)) {
				driver.switchTo().window(ans);
				
			}
			
		}
		WebElement print = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		System.out.println(print.getText());
	}
	@Test(enabled=true)
	private void tc5() throws AWTException, InterruptedException {
	
	
	}
}
