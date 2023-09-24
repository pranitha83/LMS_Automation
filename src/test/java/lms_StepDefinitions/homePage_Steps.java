package lms_StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage_Steps {
	WebDriver driver;
	@Given("Admin able to launch browser")
	public void admin_able_to_launch_browser() {
	  // WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
	   driver.get("http://amazon.com/");
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
	   String url = driver.getCurrentUrl();
	    System.out.println();
	}
}
