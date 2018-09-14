package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CreateGoalDefaultimagePage extends BasePage {
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='modalItem']")
	private WebElement Defauld_image;

	@FindBy(xpath = "//*[@id='modalItem']/span[2]")
	private WebElement Camara_roll;

	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement nextbutton;

	public CreateGoalDefaultimagePage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectDefauld_image() {
		Defauld_image.click();
		
		Reporter.log("<br>selectDefauld_image", true);
}
	public void  selectCamara_roll() {
		Camara_roll.click();
		
		Reporter.log("<br>selectCamara_roll", true);
	}
	public  Profilepage selectNextbutton() {
		nextbutton.click();
		Reporter.log("<br>selectNext_button", true);
		return new Profilepage(driver);
}

		
	public CreateGoalDefaultimagePage waitForPage() {
		// TODO Auto-generated method stub
		return this;

}}
