package Dhaka;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice27 {  
	ChromeDriver dr;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", 
    			"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver dr= new ChromeDriver();
	dr.get("https://www.macys.com");
	
	
	
	
	
	
	
	}
	

}
