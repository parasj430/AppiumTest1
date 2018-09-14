package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class ChooseGoaltypePage extends BasePage{
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='master-content']//li[1]//span[2]")
	private WebElement HouseGoalicon;

	@FindBy(xpath = "//*[@id='master-content']//li[2]")
	private WebElement Vacation_Goal_icon;

	@FindBy(xpath = "//*[@id='master-content']//li[3]")
	private WebElement Automobile_Goal_icon;
	
	@FindBy(xpath = "//*[@id='master-content']//li[4]")
	private WebElement  Weeding_Goal_icon;
	
	@FindBy(xpath = "//*[@id='master-content']//li[5]")
	private WebElement  Education_Goal_icon;
	
	@FindBy(xpath = "//*[@id='master-content']//li[6]")
	private WebElement  Custom_icon;
	
	@FindBy(xpath = "//*[@id='master-content']//li[7]")
	private WebElement BuidWealth_icon;
	
	@FindBy(xpath = "//*[@id='master-content']//li[7]")
	private WebElement Safetynet_icon;
	
	public ChooseGoaltypePage ( AppiumDriver driver) {
	 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CreateGoalGoalnamePage selectHouseGoalicon() {
		HouseGoalicon.click();
		
		Reporter.log("<br>selectHouse_Goal_icon", true);
		return new CreateGoalGoalnamePage(driver);	
	}
	public void selectVacation_Goal_icon () {
		 Vacation_Goal_icon.click();
		
		 Reporter.log("<br> selectVacation_Goal_icon", true);
	}
	public void selectAutomobile_Goal_icon() {
		Automobile_Goal_icon.click();
		
		Reporter.log("<br>selectAutomobile_Goal_icon", true);
	}
	
	public void selectWeeding_Goal_icon() {
		 Weeding_Goal_icon.click();
		
		 Reporter.log("<br>selectWeeding_Goal_icon", true);
	}
	public void selectEducation_Goal_icon() {
		Education_Goal_icon.click();
		
		Reporter.log("<br>selectEducation_Goal_icon", true);
	}
	public void selectCustom_icon() {
		Custom_icon.click();
		
		Reporter.log("<br>selectCustom_icon", true);
	}
	public void selectBuidWealth_icon() {
		BuidWealth_icon.click();
		Reporter.log("<br>selectBuidWealth_icon", true);
		
	}
	public void selectSafetynet_icon() {
		Safetynet_icon.click();
		
		Reporter.log("<br>selectSafetynet_icon", true);
	}
	
	public ChooseGoaltypePage waitForPage() {
		// TODO Auto-generated method stub
		return this;
	}


}
