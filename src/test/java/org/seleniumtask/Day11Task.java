package org.seleniumtask;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day11Task {
	WebDriver driver;
	@BeforeClass
	private void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test(enabled=true)
	private void tc1() throws AWTException, IOException {
driver.get("https://en.wikipedia.org/wiki/Table_(information)");
		
		WebElement tables = driver.findElement(By.xpath("(//table[@class='wikitable'])[1]"));
		System.out.println("size of table: "+tables.getSize());
		
		List<WebElement> allRows = tables.findElements(By.tagName("tr"));
		System.out.println("no of rows: "+allRows.size());
		
		List<WebElement> allHeadings = tables.findElements(By.tagName("th"));
		System.out.println("no of headings: "+allHeadings.size());
		
		List<WebElement> allDatas = tables.findElements(By.tagName("td"));
		System.out.println("no of data: "+allDatas.size());
		
		//set of rows
		for (int i = 1; i < 4; i++) {
		WebElement element = allRows.get(i);
		List<WebElement> list = element.findElements(By.tagName("td"));
		for (int j = 0; j < list.size(); j++) {
			
			WebElement element2 = list.get(j);
			System.out.print(element2.getText() +" ");
			
		}
		
		}
		// reverse
		System.out.println("\n***");
		for (int i = 3; i >=1; i--) {
			WebElement element = allRows.get(i);
			List<WebElement> list = element.findElements(By.tagName("td"));
			for (int j = 0; j < list.size(); j++) {
				
				WebElement element2 = list.get(j);
				System.out.print(element2.getText());
				
			}
			
			}
		System.out.println(" ");
		//particular row 
		WebElement element = allRows.get(8);
		System.out.println(element.getText()+" ");
		
				
			}
			
}
