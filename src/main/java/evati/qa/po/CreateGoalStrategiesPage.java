package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CreateGoalStrategiesPage {
	
private  AppiumDriver driver;
	

	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement Next_Button;

	

	public CreateGoalStrategiesPage( AppiumDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public   EmployerDetailpage selectNextButton() {
		Next_Button.click();
		
		Reporter.log("<br>selectNext_Button", true);
		 return new EmployerDetailpage(driver); 
}
	

	
	private CreateGoalStrategiesPage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}

}
