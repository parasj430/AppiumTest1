package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CreateFirstGoalPopupPage  extends BasePage{
	
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='commonModel']//div[2]/a")
	private WebElement CreateGoal;

	@FindBy(xpath = "//*[@id='commonModel']//div[3]/a")
	private WebElement Close;

	
	public CreateFirstGoalPopupPage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public ChooseGoaltypePage CreateAGoal() {
		CreateGoal.click();	
	Reporter.log("<br>CreateAGoal", true);
	return new ChooseGoaltypePage(driver);
}
	
	public void ClickClose() {
		Close.click();	
	Reporter.log("<br>ClickClose", true);
}


	@Override
	public CreateFirstGoalPopupPage waitForPage() {
		// TODO Auto-generated method stub
		return this;
	}}
