package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CreateGoalGoalnamePage extends BasePage{
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='user-password']")
	private WebElement Goalname;

	@FindBy(xpath = "//*[@id=\"master-footer\"]//button")
	private WebElement nextButton;

	
	public CreateGoalGoalnamePage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public CreateGoalDefaultimagePage enterGoalname(String str) {
		Goalname.sendKeys(str);	
	Reporter.log("<br>enterGoalname", true);
	return new CreateGoalDefaultimagePage(driver);
}
	
	public CreateGoalDefaultimagePage ClickNext() {
		nextButton.click();	
	Reporter.log("<br> ClickNext", true);
	 return new CreateGoalDefaultimagePage(driver);
}


	@Override
	public CreateGoalGoalnamePage waitForPage() {
		// TODO Auto-generated method stub
		return this;
	}}



