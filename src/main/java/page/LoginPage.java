package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_FIELD;

	public void enterUserName(String username) {
		USERNAME_FIELD.sendKeys(username);
	}

	public void enterPassWord(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	public void enterCredentials(String username,String password) {
		USERNAME_FIELD.sendKeys(username);
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SIGNIN_BUTTON_FIELD.click();

	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = format.format(date);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label +".png"));
	}
	/*public static void main(String[] args) {
		newScreenShort();
	}
	public static void newScreenShort() {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
	}*/
}
