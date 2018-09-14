/**
 * 
 */
package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import evati.qa.utils.WaitTime;
import io.appium.java_client.AppiumDriver;



/**
 * @author shubham
 *
 */
public class LoginPage extends BasePage {

	private  AppiumDriver driver;

	@FindBy(xpath = "//android.widget.EditText[@text='Email Address *']")
	private WebElement userName;
	
	
	@FindBy(xpath = "//android.widget.EditText[@text='Password *']")
	private WebElement password;
		
	@FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
	private WebElement loginButton;

	public LoginPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName(String str)
	{  
		userName.sendKeys(str);
		Reporter.log("<br>enterUserName", true);
	}
	
	public void enterPassword(String str)
	{
		password.sendKeys(str);
		Reporter.log("<br>enterPassword", true);
	}
	
	public DashboardPage clickLoginBtn() {
		loginButton.click();
		Reporter.log("<br>clickLoginBtn", true);
		return new DashboardPage(driver);
	}


	@Override
	public LoginPage waitForPage() {
		//this.waitForBlueLine(WaitTime.MEDIUM_TO);
		return this;
	}

}
