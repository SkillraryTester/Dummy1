package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verfiy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement us = driver.findElement(By.id("username"));
		String s = us.getAttribute("id");
		System.out.println(s);
		String ele = us.getTagName();
		System.out.println(ele);
		int h = us.getSize().getHeight();
		System.out.println(h);
		int w = us.getSize().getWidth();
		System.out.println(w);
		
		int x = us.getLocation().getX();
		System.out.println(x);
		
		int y = us.getLocation().getY();
		System.out.println(y);
	         
		
//		boolean d = us.isDisplayed();
//		System.out.println(d);
//		if( us.isDisplayed())
//		{
//			System.out.println("Pass:the element is dispalyed");
//		}
//		else
//		{
//			System.out.println("fail:the lement is not dispalyed");
//		}
//		WebElement ch = driver.findElement(By.id("keepLoggedInLabel"));
//boolean c = ch.isSelected();
//System.out.println(c);
//if(ch.isSelected())
//{
//	System.out.println("pass: the element is selected");
//}
//else
//{
//	System.out.println("fail: the element is not selected");
//}
//
//WebElement lb = driver.findElement(By.xpath("//div[.='Login ']"));
//boolean e = lb.isEnabled();
//System.out.println(e);
//if(lb.isEnabled())
//{
//	System.out.println("pass: the element is enabled");
//}
//else
//{
//	System.out.println("fail: the element is not enabled");
//}
//
driver.close();
	}
	

}
