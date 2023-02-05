package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePages {
	
	WebDriver driver; 
	
	public googlePages(WebDriver driver) {
		
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	
	WebElement searchBx;
	
	public void enterSearch(String testData) {
		
		searchBx.sendKeys(testData);
		
	}
	
	@FindBy(name="btnK")
	
	WebElement searchButton;
	
	public void clickSearch() {
		
		searchButton.submit();
		
	}

}
