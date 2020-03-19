package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingapp {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	String t = driver.getTitle();
	System.out.println(t);
	String u = driver.getCurrentUrl();
	System.out.println(u);
	driver.close();
		
	
	}

}
