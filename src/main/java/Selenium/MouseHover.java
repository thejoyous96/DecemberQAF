package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Locate Hello,Sign In ..... and Sub-Category - Watch list.
		
		WebElement a = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		WebElement b = driver.findElement(By.xpath("//span[contains(text(),'Watchlist')]"));
	
		Actions act = new Actions (driver);
		
		act.moveToElement(a).moveToElement(b).click().build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
