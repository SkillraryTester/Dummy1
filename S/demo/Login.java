package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebDriverWait w=new WebDriverWait(driver,5);
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("phone");
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='Go123']"));
		w.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		

	}

}
