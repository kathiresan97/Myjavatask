package org.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task {

	@Test(enabled=false)
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(src1, des1).perform();
		a.dragAndDrop(src2, des2).perform();
	}
	@Test(enabled=false)
	private void tc2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.amazon.in/");
		
		WebElement btnPrime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(btnPrime).perform();
		
		Thread.sleep(2000);
		
		WebElement fastdeliveryImg = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		
		
		fastdeliveryImg.click();

		}
	@Test(enabled=false)
	private void tc3() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		WebElement homeandfurnitureDrop = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(homeandfurnitureDrop).perform();
		Thread.sleep(3000);
		
		WebElement bathtowelBtn = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
		
		a.moveToElement(bathtowelBtn).perform();
		Thread.sleep(3000);

		bathtowelBtn.click();
		Thread.sleep(3000);
		
		WebElement productTowel = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		String title = productTowel.getAttribute("title");
		System.out.println(title);

	
	
	}
	@Test(enabled=false)
	private void tc4() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(3000);
		
		WebElement mobileDrop = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[21]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobileDrop).perform();
		Thread.sleep(3000);
		
		WebElement smartPhones = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		smartPhones.click();
		Thread.sleep(3000);
		
		WebElement priceBox = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		priceBox.click();
	}
	
	@Test(enabled=false)
	private void tc5() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(5000);
		
		WebElement sportsDrop = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[26]"));
		Actions a = new Actions(driver);
		a.moveToElement(sportsDrop).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
	}
	@Test(enabled=false)
	private void tc6() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courseDrop = driver.findElement(By.xpath("//div[text()='Courses '] "));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseDrop).perform();
		
		WebElement softwareTesting = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(softwareTesting).perform();
		softwareTesting.click();
		}
	@Test(enabled=false)
	private void tc7()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courseDrop = driver.findElement(By.xpath("//div[text()='Courses '] "));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseDrop).perform();
		
		WebElement oracleCourse = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracleCourse).perform();
		oracleCourse.click();
	}
	@Test(enabled=false)
	private void tc8()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courseDrop = driver.findElement(By.xpath("//div[text()='Courses '] "));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseDrop).perform();
		
		WebElement dataWarehouse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(dataWarehouse).perform();
		dataWarehouse.click();
	}
	@Test(enabled=false)
	private void tc9()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courseDrop = driver.findElement(By.xpath("//div[text()='Courses '] "));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseDrop).perform();
		
		WebElement rpaCourse = driver.findElement(By.xpath("//div[@title='RPA']"));
		a.moveToElement(rpaCourse).perform();
		rpaCourse.click();
		
		WebElement bluePrism = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		a.moveToElement(bluePrism).perform();
		bluePrism.click();
	}
	@Test(enabled=false)
	private void tc10()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courseDrop = driver.findElement(By.xpath("//div[text()='Courses '] "));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseDrop).perform();
		
		WebElement dataWarehouse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(dataWarehouse).perform();
		dataWarehouse.click();
		
	}
	@Test(enabled=false)
	private void tc11() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://www.homedepot.com/");
		
		WebElement allDept = driver.findElement(By.xpath("(//li[@class='ShoppingLinks__item'])[1]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(allDept).perform();
		
		WebElement heatingTab = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heatingTab).perform();
		Thread.sleep(5000);
		
		WebElement airConditioner = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(airConditioner).perform();
		
		WebElement portableAc = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])"));
		a.moveToElement(portableAc).perform();
		portableAc.click();
	}
	@Test(enabled=false)
	private void tc12() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		Thread.sleep(10000);

		WebElement allDept = driver.findElement(By.xpath("(//li[@class='ShoppingLinks__item'])[1]"));

		Actions a = new Actions(driver);

		a.moveToElement(allDept).perform();
		Thread.sleep(3000);

		WebElement paintTab = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		a.moveToElement(paintTab).perform();
		Thread.sleep(3000);

		WebElement interiorPaint = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		a.moveToElement(interiorPaint).perform();
		Thread.sleep(3000);

		WebElement ceilingPaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.moveToElement(ceilingPaint).perform();
		ceilingPaint.click();

	}
	@Test(enabled=false)
	private void tc13() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
		
		WebElement mobileTab = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobileTab).perform();
		
		WebElement newCover = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		a.moveToElement(newCover).perform();
		newCover.click();
		}
	@Test(enabled=false)
	private void tc14() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement womenFashion = driver.findElement(By.xpath("//li[@navindex='7']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(womenFashion).perform();
		
		WebElement footWare = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		a.moveToElement(footWare).perform();
		
		WebElement heels = driver.findElement(By.xpath("(//span[text()='Heels'])[2]"));
		a.moveToElement(heels).perform();
		heels.click();
		}
	@Test(enabled=false)
	private void tc15() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement signinTab = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		a.moveToElement(signinTab).perform();
		
		WebElement signupTab = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		a.moveToElement(signupTab).perform();
		signupTab.click();
		Thread.sleep(3000);
		
		WebElement txtName = driver.findElement(By.xpath("//input[@tabindex='1']"));
		txtName.sendKeys("greens");
		
		WebElement txtPhoneno = driver.findElement(By.xpath("//input[@tabindex='3']"));
		txtPhoneno.sendKeys("123456789");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@tabindex='4']"));
		txtEmail.sendKeys("greens12345");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@tabindex='5']"));
		txtPass.sendKeys("greens@12345");


		
		
	}
	@Test(enabled=false)
	private void tc16() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		WebElement tryprimeBtn = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(tryprimeBtn).perform();
		
		Thread.sleep(5000);
		
		WebElement fastdeliveryImg = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		
		a.moveToElement(fastdeliveryImg).perform();
		
		fastdeliveryImg.click();
		

	}
	@Test(enabled=false)
	private void tc17() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		WebElement homeandfurnitureDrop = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(homeandfurnitureDrop).perform();
		Thread.sleep(3000);
		
		WebElement bathtowelBtn = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
		
		a.moveToElement(bathtowelBtn).perform();
		Thread.sleep(3000);

		bathtowelBtn.click();
		Thread.sleep(3000);
		
		WebElement productTowel = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		String title = productTowel.getAttribute("title");
		System.out.println(title);
		}
	
	@Test(enabled=false)
	private void tc18() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement babyTab = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions a = new Actions(driver);
		a.moveToElement(babyTab).perform();
		Thread.sleep(3000);
		
		WebElement rcToys = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		a.moveToElement(rcToys).perform();
		rcToys.click();
		
	}
@Test(enabled=false)
private void tc19() throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	WebElement electronisTab = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions a = new Actions(driver);
	a.moveToElement(electronisTab).perform();
	Thread.sleep(3000);
	
	WebElement realmeTab = driver.findElement(By.xpath("//a[text()='Realme']"));
	a.moveToElement(realmeTab).perform();
	realmeTab.click();
	
}

}
