package org.seleniumtask;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7Task {
	WebDriver driver;
	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test(enabled=false)
	private void tc1() throws AWTException, IOException {
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\greens.png");
		FileUtils.copyFile(src, des);
	
	}
	@Test(enabled=false)
	private void tc2() throws AWTException, IOException {
		driver.get("http://toolsqa.com/");
		
		WebElement recentTab = driver.findElement(By.xpath("//span[text()='Specflow C-Sharp']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", recentTab);

	}
	@Test(enabled=false)
	private void tc3() throws AWTException, IOException, InterruptedException {
		driver.get("http://toolsqa.com/");
		Thread.sleep(30000);
		
		WebElement printSel = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", printSel);
		
		String s = printSel.getText();
		System.out.println(s);
	}
	@Test(enabled=false)
	private void tc4() throws AWTException, IOException, InterruptedException {
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement intPhoneno = driver.findElement(By.xpath("(//span[text()='+91- 89399 15577 / +91 6385 149 793'])[5]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", intPhoneno);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\perumbakamAdd.png");
		FileUtils.copyFile(src, des);
	}	
	@Test(enabled=false)
	private void tc5() throws AWTException, IOException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement tabJob = driver.findElement(By.id("heading20"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", tabJob);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\jobOpening.png") ;
		FileUtils.copyFile(src, des);
		
		WebElement onlineClass = driver.findElement(By.xpath("//a[text()='Book a free demo']"));
		js.executeScript("arguments[0].scrollIntoView('false')", onlineClass);
	}
	@Test(enabled=false)
	private void tc6() throws AWTException, IOException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement scrollDown = driver.findElement(By.xpath("//h3[text()='Automation Testing using TestComplete']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", scrollDown);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\topTrends.png") ;
		FileUtils.copyFile(src, des);
	}
	
	@Test(enabled=false)
	private void tc7() throws AWTException, IOException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement srollDown = driver.findElement(By.xpath("//span[text()='Certification']"));
		WebElement interviewQus = driver.findElement(By.id("heading20"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", srollDown);
		js.executeScript("arguments[0].click()", interviewQus);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\interviewQus.png");
		FileUtils.copyFile(src, des);
		
	}
	@Test(enabled=false)
	private void tc8() throws AWTException, IOException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement srollDown = driver.findElement(By.id("heading301"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", srollDown);

		WebElement corejava = driver.findElement(By.id("heading302"));
		js.executeScript("arguments[0].click()", corejava);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\coreJavaQus.png");
		FileUtils.copyFile(src, des);
		
	}	
	@Test(enabled=false)
	private void tc9() throws AWTException, IOException, InterruptedException {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','iphone')", txtSearch);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\flipkartIphone.png");
		FileUtils.copyFile(src, des);
	}	
	@Test(enabled=false)
	private void tc10() throws AWTException, IOException, InterruptedException {
		driver.get("https://www.amazon.in/");
		
		WebElement txtProduct = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','motorolo')", txtProduct);
		
		WebElement tabSearch = driver.findElement(By.xpath("//input[@value='Go']"));
		js.executeScript("arguments[0].click()", tabSearch);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\Amazon.png");
		FileUtils.copyFile(src, des);
	}	
	@Test(enabled=false)
	private void tc11() throws AWTException, IOException, InterruptedException {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement tabBaby = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions a = new Actions(driver);
		a.moveToElement(tabBaby).perform();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\flipkartBaby.png");
		FileUtils.copyFile(src, des);
		
	}
	@Test(enabled=true)
	private void tc12() throws AWTException, IOException, InterruptedException {
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(30000);

		
		WebElement txtProduct = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','HP laptop')", txtProduct);
		Thread.sleep(3000);
		
		WebElement tabSearch = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		js.executeScript("arguments[0].click()", tabSearch);
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\Screenshot\\Snapdeal.png");
		FileUtils.copyFile(src, des);
	}
	
}
