package Dhaka;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {
ChromeDriver dr;
@Test
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 dr=new ChromeDriver();
	 dr.get("https://www.facebook.com/");
	 
public void closeBrowser() {
	
}
	 
	 
	 
}
}
