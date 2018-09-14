/**
 * 
 */
package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

/**
 * @author paras
 **/
public abstract class BasePage {
	
	protected  AppiumDriver driver;
	
	
	public BasePage(AppiumDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	public abstract BasePage waitForPage();
	
	
}
