package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class sample {

	public static void main(String[] args) throws IOException {
	
//	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\excel\\Book2.xlsx");
//	FileInputStream fin = new FileInputStream(file);
//	Workbook w = new XSSFWorkbook(fin);
//	Sheet s = w.getSheet("Sheet1");
//	Row r = s.getRow(0);
//	Cell c = r.getCell(0);
//	c.setCellValue("241535");
//	FileOutputStream fout = new FileOutputStream(file);
//	w.write(fout);
//	System.out.println(c);
//	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int count=0;
		for (WebElement x : links) {
			String attribute = x.getAttribute("href");
	
		URL u = new URL(attribute);
		URLConnection o = u.openConnection();
		HttpURLConnection h=(HttpURLConnection) o;
	//	HttpURLConnection h=(HttpURLConnection) o;
		
		int responseCode = h.getResponseCode();
		if (responseCode!=200) {
			count++;
			System.out.println(attribute);
			
		}
		}
		System.out.println(count);
	}
}
