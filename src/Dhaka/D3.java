package Dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D3 {
	ChromeDriver dr;
	D3(ChromeDriver c){
		dr=c;
	}
public void logIn(String a,String b,String c,String d ) {
	D2 x=new D2();
	x.setFname("md");
	x.setLname("shamim");
	x.setEmail("abc");
	x.setPass("12345");
	dr.findElement(By.cssSelector("#u_0_c")).sendKeys(x.getFname());
	dr.findElement(By.cssSelector("#u_0_e")).sendKeys(x.getLname());
    dr.findElement(By.cssSelector("#u_0_h")).sendKeys(x.getEmail());
	dr.findElement(By.cssSelector("#u_0_o")).sendKeys(x.getPass());
	
	
	
}
	
public void dropmonth() {
	Select s=new Select(dr.findElement(By.id("month")));
	s.selectByVisibleText("Mar");
	}

public void dropday() {
	Select c=new Select(dr.findElement(By.id("day")));
	c.selectByVisibleText("25");
}

public void dropYear() {
	Select b=new Select(dr.findElement(By.id("year")));
	b.selectByVisibleText("2010");
}

public void radioButton() {
	dr.findElement(By.id("u_0_9")).click();
}











	

}
