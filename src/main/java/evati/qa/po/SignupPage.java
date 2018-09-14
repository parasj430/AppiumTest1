package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class SignupPage extends BasePage{

	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@name='Email']")
	private WebElement Email_id;

	@FindBy(xpath = "//*[@id='user-password']")
	private WebElement Password;

	@FindBy(xpath = "//*[@id='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id='checkbox1']/label/div")
	private WebElement Toggle_customer_agreement;
	
	@FindBy(xpath = "//*[@id='checkbox2']/label/div")
	private WebElement Toggle_US_citizen;
	
	
	@FindBy(xpath = "//*[@id='btnNext']")
	private WebElement Button_grt_started;
	
	public SignupPage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail_id(String str) {
		Email_id.sendKeys(str);	
	Reporter.log("<br>enterEmail_id", true);
}
	public void enterPassword(String str) {
		Password.sendKeys(str);
		
		Reporter.log("<br>enterPassword", true);	
}
	public void enterconfirmPassword(String str) {
		confirmPassword.sendKeys(str);
		
		Reporter.log("<br>enterconfirmPassword", true);
}

	public void enterToggle_customer_agreement() {
		Toggle_customer_agreement.click();
		Reporter.log("<br>enterPassword", true);
		
}
	
	public void enterToggle_US_citizen() {
		Toggle_US_citizen.click();
		
		Reporter.log("<br>enterToggle_US_citizen", true);	
}

	public DashboardPage enterButton_grt_started() {
		Button_grt_started.click();
		
		Reporter.log("<br>enterButton_grt_started", true);
		return new DashboardPage(driver);
}



	@Override
	public SignupPage waitForPage() {
		// TODO Auto-generated method stub
		return this;
}}

