package org.seleniumtask;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9Task {
	WebDriver driver;
	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	//its not work
	@Test(enabled=false)
	private void tc1() throws AWTException, IOException {
		driver.get("http://demoqa.com/automation-practice-form/");
		
		WebElement dropState = driver.findElement(By.xpath("//div[@class=' css-1wy0on6']"));
		
		
		Select s = new Select(dropState);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if (i%2==1) {
				System.out.println(options.get(i).getAttribute("value"));
				
			}
			
		}
	}
	@Test(enabled=true)
	private void tc2() throws AWTException, InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement dropYear = driver.findElement(By.id("year"));
		
		Select s = new Select(dropYear);
		List<WebElement> options = s.getOptions();
		for (WebElement printYear : options) {
			String attribute = printYear.getAttribute("value");
			System.out.println(attribute);
			}
		
	}
	@Test(enabled=false)
	private void tc3() throws AWTException, InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		WebElement dropMonth = driver.findElement(By.id("month"));
		
		Select s = new Select(dropMonth);
		List<WebElement> options = s.getOptions();
		for (WebElement printMonth : options) {
			String text = printMonth.getText();
			System.out.println(text);
		
			
		}
	}
	
	@Test(enabled=false)
	private void tc4() throws AWTException, InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		
		WebElement dropDate = driver.findElement(By.id("day"));
		Select s = new Select(dropDate);
		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size() ; i+=2) {
			
				System.out.println(i);
				
			
			
		}
	}
	
	@Test(enabled=false)
	private void tc5() throws AWTException, InterruptedException {
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	WebElement dropCountry = driver.findElement(By.name("country"));
	
	Select s = new Select(dropCountry);
	List<WebElement> options = s.getOptions();
	for (WebElement country : options) {
		String printCountry = country.getText();
		System.out.println(printCountry);
		
		}
	}
	@Test(enabled=false)
	private void tc6() throws AWTException, InterruptedException {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement dropCountry = driver.findElement(By.name("country"));
		
		Select s = new Select(dropCountry);
		List<WebElement> options = s.getOptions();
		for (WebElement country : options) {
			String printCountry = country.getAttribute("value");
			System.out.println(printCountry);
		}
	}
	@Test(enabled=false)
	private void tc7() throws AWTException, InterruptedException {
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("AravindSivakumar");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);

		WebElement dropLoction = driver.findElement(By.id("location"));
		Select s = new Select(dropLoction);
		s.selectByValue("New York");

		WebElement dropHotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(dropHotel);
		s1.selectByValue("Hotel Sunshine");

		WebElement dropRoomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(dropRoomtype);
		s2.selectByValue("Super Deluxe");

		WebElement dropRoomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(dropRoomno);
		s3.selectByValue("3");

		// driver.findElement(By.id("date_pick")).sendKeys("15/12/2020");

		// driver.findElement(By.id("datepick_out")).sendKeys("18/12/2020");

		WebElement dropAdult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(dropAdult);
		s4.selectByValue("2");

		WebElement dropChild = driver.findElement(By.id("child_room"));
		Select s5 = new Select(dropChild);
		s5.selectByValue("0");

		driver.findElement(By.id("Submit")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("first_name")).sendKeys("Aravind");
		driver.findElement(By.id("last_name")).sendKeys("Sivakumar");
		driver.findElement(By.id("address")).sendKeys("greens,perumbakam");
		driver.findElement(By.id("cc_num")).sendKeys("9500695005123456");

		WebElement dropCctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(dropCctype);
		s6.selectByValue("VISA");
		Thread.sleep(3000);

		WebElement dropCcmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(dropCcmonth);
		s7.selectByValue("4");

		WebElement dropCcyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(dropCcyear);
		s8.selectByValue("2022");

		driver.findElement(By.id("cc_cvv")).sendKeys("456");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);

		WebElement orderNo = driver.findElement(By.id("order_no"));
		String no = orderNo.getAttribute("value");
		System.out.println(no);

	}
	
	@Test(enabled=false)
	private void tc8() throws AWTException, InterruptedException {
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("AravindSivakumar");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		WebElement dropRoom = driver.findElement(By.id("room_type"));
		
		Select s = new Select(dropRoom);
		List<WebElement> options = s.getOptions();
		for (WebElement room : options) {
			String text = room.getText();
			System.out.println(text);
			
		}
	}
	
	@Test(enabled=false)
	private void tc9() throws AWTException, InterruptedException {
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("AravindSivakumar");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		WebElement dropLoction = driver.findElement(By.id("location"));
		Select s = new Select(dropLoction);
		List<WebElement> options = s.getOptions();
		for (WebElement location : options) {
		
		String text = location.getText();
		System.out.println(text);
		}
	}
	@Test(enabled=false)
	private void tc10() throws AWTException, InterruptedException {
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("AravindSivakumar");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		WebElement dropAdult = driver.findElement(By.id("adult_room"));
		Select s = new Select(dropAdult);
		List<WebElement> options = s.getOptions();
		for (WebElement room : options) {
		
		String text = room.getText();
		System.out.println(text);
		}
	}
	@Test(enabled=false)
	private void tc11() throws AWTException, InterruptedException {

	driver.manage().window().maximize();
	driver.get(" http://output.jsbin.com/osebed/2");
	WebElement dropFruits = driver.findElement(By.id("fruits"));
	
	Select s = new Select(dropFruits);
	List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
		if (i%2==1) {
			System.out.println(options.get(i).getAttribute("value"));
			
		}
		
	}
}
	@Test(enabled=false)
	private void tc12() throws AWTException, InterruptedException {
		driver.get(" http://output.jsbin.com/osebed/2");
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(dropFruits);
		List<WebElement> options = s.getOptions();
		for (WebElement fruits : options) {
			String text = fruits.getText();
			System.out.println(text);
			
		}
	}
}
