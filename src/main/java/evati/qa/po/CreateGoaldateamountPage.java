package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CreateGoaldateamountPage {

	
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mobiscroll1531992181598']")
	private WebElement Goal_Date;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181610']/div[3]/div[3]/div[11]")
	private WebElement Goal_Date_value;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement Goal_Date_close;

	@FindBy(xpath = "//*[@id='goalAmount']")
	private WebElement goalAmount;
	
	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement Next_button;
	
	public CreateGoaldateamountPage( AppiumDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectGoal_Date() {
		Goal_Date.click();
		Goal_Date_value.click();
		Goal_Date_close.click();
		
		Reporter.log("<br>selectGoal_Date", true);
}
	public void selectgoalAmount(String str) {
		goalAmount.sendKeys(str);
		
		Reporter.log("<br>selectgoalAmount", true);	
}
	

	public CreateGoalStrategiesPage select_Next_button() {
		 Next_button.click();
		 Reporter.log("<br>select_Next_button", true);
		 return new CreateGoalStrategiesPage(driver);
		
}
	private CreateGoaldateamountPage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}
}
