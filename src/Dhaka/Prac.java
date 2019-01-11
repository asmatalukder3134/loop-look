package Dhaka;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac {
	ChromeDriver dr;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	ChromeDriver dr=new ChromeDriver();
	dr.get("https://www.macys.com");
	
	public void menu(WebDriver dr) {
		Actions ac=new Actions(dr);
	
	ac.moveToElement(dr.findElement(By.xpath(""))).perform();
	List<WebElement> elements=dr.findElements(By.xpath(""));
	Thread.sleep(2000);
	System.out.println(elements.size());
	for(int i=0;i<elements.size();i++);
	
	String s=elements.get(i).getText();//actual value(i)=elements.get(i).get text();
	System.out.println(s);
	if(s.equals("handbag")) {
		System.out.println("its ok");
	}
	dr.findElement(By.xpath("shop by department")).click();
	
	
	
	}

}}
