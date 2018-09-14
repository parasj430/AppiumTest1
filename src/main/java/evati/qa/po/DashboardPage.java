package evati.qa.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class DashboardPage extends BasePage{
		
	@FindBy(xpath = "//android.widget.RelativeLayout")
	private WebElement bottomNav_dashboard;
	
	@FindBy(xpath = "//*[@id='master-content']//figcaption")
	private WebElement Dashboard_image;
	
	@FindBy(xpath = "//span[contains(.,'Activity')]")
	private WebElement bottomNav_activity;
	
	@FindBy(xpath = "//span[contains(.,'Payment')]")
	private WebElement bottomNav_payment;
	
	@FindBy(xpath = "//span[contains(.,'Tool')]")
	private WebElement bottomNav_tool;
	
	@FindBy(xpath = "//span[contains(.,'Settings')]")
	private WebElement bottomNav_settings;
	
	public DashboardPage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		}

	public CreateFirstGoalPopupPage dashboardicon()
	{
		 bottomNav_dashboard.click();
		Reporter.log("<br>dashboardicon", true);
		return new CreateFirstGoalPopupPage(driver);
	}
	
	public void clickDashboard_image()
	{
		Dashboard_image.click();
		Reporter.log("<br>clickDashboard_image", true);
		
	}
	public void activityicon()
	{
		bottomNav_activity.click();
		Reporter.log("<br>activityicon", true);
	}
	
	public void paymenticon()
	{
		bottomNav_payment.click();
		Reporter.log("<br>paymenticon", true);
	}
	
	public void toolicon()
	{
		 bottomNav_tool.click();
		Reporter.log("<br>toolicon", true);
	}
	
	public void settingsicon()
	{
		bottomNav_settings.click();
		Reporter.log("<br>settingsicon", true);
	}
	
	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return this;
	}

	public String getActiveLeftNavigatorTab() {
		String str =bottomNav_dashboard.getText();
		Reporter.log("<br>getActiveLeftNavigatorTab"+str, true);
		return str;
	}
	
	

}
