package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("newsletter-input")).sendKeys("bharanigramesh28@gmail.com");
		driver.findElement(By.name("submitNewsletter")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		
driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]")).click();
WebDriverWait w=new WebDriverWait(driver,10);
WebElement ele = driver.findElement(By.xpath("//span[text()='Add to cart']"));
w.until(ExpectedConditions.elementToBeClickable(ele)).click();
driver.findElement(By.xpath("//span[@title='Close window']")).click();

	}

}
