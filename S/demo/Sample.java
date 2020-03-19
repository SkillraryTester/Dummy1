package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.com/");
		//back
		driver.navigate().back();
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
