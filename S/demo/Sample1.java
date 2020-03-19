package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("u_0_m")).sendKeys("vhhhssdhbvhsyfghsfgfm");
//		driver.findElement(By.name("lastname")).sendKeys("Skillrary");
//		//driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.partialLinkText("account?")).click();
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("vqgdg");

	}

}
