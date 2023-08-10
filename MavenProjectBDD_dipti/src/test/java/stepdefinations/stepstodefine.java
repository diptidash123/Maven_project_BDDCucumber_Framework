package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepstodefine {
	
	public WebDriver driver;
	public static POMClass pom;
	@Given("opening browser window in chrome browser.")
	public void opening_browser_window_in_chrome_browser() {

		//System.setProperty("webdriver.chrome.driver","D:/Eclipse Folder/BDD_framework_case_study1/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("Given: statement is executed correctly");
		pom = new POMClass(driver);
	}

	@When("^user should provide credentials (.*) and (.*) for login page$")
	public void user_should_provide_credentials_and_for_login_page(String username, String password) {
		pom.login(username, password);
	}

	@Then("user should clikable login button successfully.")
	public void user_should_clikable_login_button_successfully() {
	    System.out.println("Successful");
	}

	@Then("closing the broswer.")
	public void closing_the_broswer() {
		System.out.println("bye");
		//driver.close();
	   
	}
	
	
}
