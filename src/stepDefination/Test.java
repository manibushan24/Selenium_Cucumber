package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

WebDriver driver;
@Given("^Open Firefox and start application$")
public void Open_Firefox_and_start_application() throws Throwable {
 driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("https://accounts.google.com/signin/v2/identifier?service=cl&passive=1209600&osid=1&continue=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Frender&followup=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Frender&scc=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}

@When("^I enter Valid username and password$")
public void I_enter_Valid_username_and_password() throws Throwable {
    Thread.sleep(20000);
    driver.findElement(By.cssSelector("#identifierId")).sendKeys("mani.bhushan666");
    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("madishetty");
}

@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {
   driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
}

@Then("^Check Functionality$")
public void Check_Functionality() throws Throwable {
	Thread.sleep(5000);
    driver.findElement(By.xpath(".//*[@id='dp_0_next']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath(".//*[@id='dp_0_day_24225']")).click();
}
}
