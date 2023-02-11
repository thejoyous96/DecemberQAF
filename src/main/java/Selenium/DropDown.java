package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// WebElement x = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		sel.selectByVisibleText("Prime Video"); 
		
		Thread.sleep(3000);

		driver.close();
	
	}

}
