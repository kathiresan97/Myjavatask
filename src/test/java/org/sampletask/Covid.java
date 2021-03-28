package org.sampletask;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Covid extends Base {

	public static void main(String[] args) {
		
		int a=2;
		System.out.println();
		
		launchBrowser("chrome");
		driver.get("https://www.covid19india.org/");
		int count=1;
		String b="Goa";
		
		//WebElement table = driver.findElement(By.xpath("//div[@class='table fadeInUp']"));
	List<WebElement> states = driver.findElements(By.xpath("//div[@class='state-name fadeInUp']"));
	List<WebElement> cases = driver.findElements(By.xpath("//div[@class='total']"));
	Map<String, String> m=new LinkedHashMap<String, String>();
//	for (int i = 0; i < states.size(); i++) {
//		for (int j = 0; j < cases.size(); j+=5) {
//			
//			m.put(states.get(i).getText(), cases.get(j).getText());
//			
//		}
		List<String> l=new LinkedList<String>();
		for (int j = 0; j < states.size(); j++) {
			String text = states.get(j).getText();
			l.add(text);
		}
		
		List<String> l1=new LinkedList<String>();
		for (int i = 0; i < cases.size(); i+=5) {
			String text = cases.get(i).getText();
			l1.add(text);
		}
	
		
		for (int i = 0; i < l.size(); i++) {
			m.put(l.get(i), l1.get(i));
		}
		
		Set<Entry<String, String>> entrySet = m.entrySet();
	for (Entry<String, String> entry : entrySet) {
		
			String key = entry.getKey();
		if (key.contains("Goa")) {
			System.out.println(entry);	
		}
		
		
		}
		
		
		
		
	}
	}

