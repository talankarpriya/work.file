package kitewithexcel;
//in pm class has no main method//


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitepinPage {
	//1.data members
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CONTINUEBUTTON;

	//constructor
	public KitepinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3.method
	
	

	public void sendpin(String kitepin) {
		PIN.sendKeys(kitepin);
	}
	public void clickoncontinuebutton() {
		CONTINUEBUTTON.click();
	}
	
}
