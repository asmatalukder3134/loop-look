package Dhaka;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Macyhw<webelement> {
	ChromeDriver dr;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.macys.com/");
		dr.manage().window().maximize();
	}
    public void macy(List<WebElement> elements, WebElement e, List<webelement> men) throws InterruptedException {
    	//dr.get("https://www.macys.com/");
		//dr.manage().window().maximize();

		Actions ac = new Actions(dr);
		//ac.moveToElement(dr.findElementByXPath("//span[@id='shopByDepartmentLabelText']")).perform();
		ac.moveToElement(dr.findElement(By.xpath("//span[@id='shopByDepartmentLabelText']"))).perform();
		ac.moveToElement(dr.findElementByXPath("//li[@id='flexid_118']/a")).click();
		int size = elements.size();
		for (int i = 2; i <= size; i++) {
			elements.get(i).click();
			e.click();
			Thread.sleep(2000);
			ac.moveToElement(dr.findElementByXPath("//li[@id='flexid_1']/a/span")).click();
			int size1 = elements.size();
			for (int k = 2; k <= size1; k++) {
				men.get(k);

			}

		}

	}
}
