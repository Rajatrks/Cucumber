package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.junit.Assert;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^user is present on login page$")
	public void user_is_present_on_login_page() {
		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	      System.out.println("open");
	}

	@When("^title of the page is OrangeHRM$")
	public void title_of_the_page_is_OrangeHRM() {
		String actual = driver.getTitle();
		Assert.assertTrue(actual.contains("OrangeHRM"));
		System.out.println("Title matched");
	}
	
	/*
	 * @Then("^user enter \"(.*)\" and \"(.*)\"$") public void
	 * user_enter_username_and_password(String username,String password) {
	 * WebElement user = driver.findElement(By.name("txtUsername")); user.clear();
	 * user.sendKeys(username); WebElement pass =
	 * driver.findElement(By.name("txtPassword")); pass.clear();
	 * pass.sendKeys(password); }
	 */
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credential) {
	    List<List<String>> data = credential.asLists(String.class);

		WebElement user = driver.findElement(By.name("txtUsername"));
		user.clear();
		user.sendKeys(data.get(0).get(0));
		WebElement pass = driver.findElement(By.name("txtPassword"));
		pass.clear();
		pass.sendKeys(data.get(0).get(1));	
	}

	@Then("^user ckick on login button$")
	public void user_ckick_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	    System.out.println("click");
	}

	@Then("^user moves to the homepage$")
	public void user_moves_to_the_homepage() {
		String actual = driver.findElement(By.xpath("//b[text()='Dashboard']")).getText();
		Assert.assertEquals("Dashboard", actual);
		System.out.println("welcome to homepage");
	}

	@And("^close the browser$")
	public void close_the_browser() {
		driver.close();
		System.out.println("close");
	}
}
