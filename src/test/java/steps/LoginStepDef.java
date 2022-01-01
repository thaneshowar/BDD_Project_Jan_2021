package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@Given("^User is on the \"([^\"]*)\" login page$")
	public void user_is_on_the_login_page(String page) throws InterruptedException {
		if (page.equalsIgnoreCase("techfios"))
			driver.get("https://www.techfios.com/billing/?ng=admin/");
		else if (page.equalsIgnoreCase("GoogleSearch"))
			driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String username) throws Throwable {

		loginPage.enterUserName(username);
		Thread.sleep(2000);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username,String password) throws Throwable {
		loginPage.enterCredentials(username, password);
		Thread.sleep(2000);
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_userName_as(String password) {
		loginPage.enterPassWord(password);

	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		loginPage.clickOnSignInButton();
		Thread.sleep(3000);
	}

	@Then("^user will land on the Dashboard Page$")
	public void user_will_land_on_the_Dashboard_Page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAtEndOfTest(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

