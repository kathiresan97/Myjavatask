package org.base;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Actions ac;
	public static JavascriptExecutor js;
	public static void launchBrowser(String browser) {
		
		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if (browser.contains("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
	}
public static void fill(WebElement element, String text) {
	element.sendKeys(text);
}




public static Actions elementMove(WebElement element) {
	ac=new Actions(driver);
	ac.moveToElement(element).perform();;
	return ac;
}
public static void textSelect(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);

}
public static void intSelect(WebElement element,int no) {
	Select s = new Select(element);
	s.selectByIndex(no);
}

public static void elementDragDrop(WebElement source,WebElement target) {
	ac.dragAndDrop(source, target).perform();
}
public static void twoClick(WebElement element) {
	ac.doubleClick(element).perform();
}

public static void powerClick(WebElement element) {
	ac.contextClick(element).perform();
}

public static void scrollDown(WebElement element) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

}
public static void scrollUp(WebElement element) {
	js.executeScript("arguments[0].scrollIntoView(true)", element);

}

public static void brokenLinks(String url) throws Exception {
	driver.get(url);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	int count=0;
	for (WebElement x : links) {
		String attribute = x.getAttribute("href");

	URL u = new URL(attribute);
	URLConnection o = u.openConnection();
	HttpURLConnection h=(HttpURLConnection) o;
	int responseCode = h.getResponseCode();
	if (responseCode!=200) {
		count++;
		System.out.println(attribute);
		
	}
	}
	System.out.println(count);

}
}
