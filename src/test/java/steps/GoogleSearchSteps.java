package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.googleBase;
import pages.googlePages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//I generate the step definitions

public class GoogleSearchSteps extends googleBase {

	//WebDriver driver;
	
	googlePages gh; //creating a object to refer/link google page class
		
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser(); //connected to GoogleBase
		
		//Copy to GoogleBase Class
		
		/*
		 
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		*/
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String testData) {
		
		//WebElement searchBx;
		
		//searchBx = driver.findElement(By.name("q"));
		
		//searchBx.sendKeys(testData);;
		
		gh = new googlePages(driver); //create object to link GooglePages

		gh.enterSearch(testData);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
		//WebElement searchBtn;
	    
		//searchBtn = driver.findElement(By.name("btnK"));
	    
	    //searchBtn.click();
	   
		gh.clickSearch(); //create object to link GooglePages
	}

	@Then("I receive related search results")
	public void i_receive_related_search_results() {
	    
		//WebElement resultStats;
	
		//resultStats = driver.findElement(By.id("result-stats"));
	
		//String results = resultStats.getText();
		
		//System.out.println("===============================================");
	
		//System.out.println(results);
			
		//System.out.println("===============================================");
		
		//driver.close(); //closes the current window once test is finished. 

		//Update after creating GoogleBase and GooglePages
		
		WebElement results = driver.findElement(By.id("result-stats")); 
		
		String displayResults = results.getText();
		
		System.out.println("===============================================");
		
		System.out.println(displayResults);
		
		System.out.println("===============================================");
		
		closeBrowser();
		
	}
}
