package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver;

	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver .get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("^User enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123@gmail.com");;
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456789");
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.id("u_0_a")).click();
	}


	@Then("^an error message should be displayed$")
	public void an_error_message_should_be_displayed() {
		List<WebElement> error = driver.findElements(By.xpath("//div[@class='_4rbf _53ij']"));
		for(int i=0; i<error.size(); i++) {
			System.out.println(error.get(i).getText());
		}
		driver.close();
	}
}
