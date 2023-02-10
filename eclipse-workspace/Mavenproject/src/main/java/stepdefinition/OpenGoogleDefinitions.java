package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OpenGoogleDefinitions {
	
	public WebDriver driver;

	  @Given("^user is entering google$")
	  public void user_is_entering_google_co_in() throws Throwable {
		  	System.out.println("Entered into the step def......................");
			System.setProperty("webdriver.chrome.driver","/home/ticvictech/eclipse-workspace/Mavenproject/driver/chromedriver");
		    driver = new ChromeDriver();
		    driver.get("https://www.google.co.in");
		    driver.manage().window().maximize();
		}
	  @When("^user is typing the search term \"([^\"]*)\"$")
	  public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
		  
		   driver.findElement(By.name("q")).sendKeys(searchTerm);
		}

	  @When("^enters the return key$")
	  public void enters_the_return_key() throws Throwable {
		  
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		}
	  @Then("^the user should see the search results$")
	  
	  public void the_user_should_see_the_search_results() throws Throwable {
		  
		
		    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.partialLinkText("agni")).isDisplayed();
		
		}

}
