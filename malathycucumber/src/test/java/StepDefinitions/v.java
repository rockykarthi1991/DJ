package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class v {

	ChromeDriver d;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("On login page");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		//step3:creating object for chromedriver class
		 d= new ChromeDriver();
		d.get("http://www.mycontactform.com");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	  System.out.println("Entering username and password");

		d.findElementById("user").sendKeys("Dhivyakarthi123");
		
		d.findElementByName("pass").sendKeys("12345");
		
	
	}

	@And("click on login button")
	public void click_on_login_button() {
	    System.out.println("clicking on login button");
		d.findElementByClassName("btn_log").click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    System.out.println("home page");
	    Thread.sleep(3000);
	    d.quit();
	}

}
