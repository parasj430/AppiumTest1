package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TradierBrokeragepopuppage {

	

	private WebDriver driver;
	@FindBy(xpath = "//*[@id='modalTradierTerms']//a")
	private WebElement Close_icon;

	
	
	public TradierBrokeragepopuppage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectCloseicon() {
		Close_icon.click();
		
		Reporter.log("<br>selectClose_icon", true);
}
	
		

	
	private TradierBrokeragepopuppage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}

}
