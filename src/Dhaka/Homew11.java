package Dhaka;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homew11 {
	   ChromeDriver dr;
	   @Test
	   public void openBrowser() {
		   System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://www.macys.com");}
			
	  public void  getelement (WebElement by,String e) {
		  dr.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("Shirt");
	  }
	   
	  public void getElements() {
		  List<WebElement> elements=dr.findElements(By.xpath(""));
	  }
	   
	   
	   
	   
	   

}
