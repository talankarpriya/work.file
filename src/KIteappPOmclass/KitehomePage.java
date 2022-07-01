package KIteappPOmclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitehomePage {
	//1.data members
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath="//a[@target='_self']")  private WebElement logoutbutton;

//2.constructor
	public KitehomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
    
	//3.method
	public String getactualuserid()
	{
		String actualuserid = userid.getText();
		return actualuserid;
	}
	public void validateuserID(String expectedUsername)
	{
		String actualuserID=userid.getText();
		String expecteduserID=expectedUsername;
	
	if(actualuserID.equals(expecteduserID))
	{
		System.out.println("user ID is matching tc is passed");
		
	}
	else {
		System.out.println("user ID is not matching tc is failed");
	}//else completed
	}
	
	public void clickonlogoutbutton() throws InterruptedException
	{
		userid.click();
	    Thread.sleep(1000);
		logoutbutton.click();
		
	}

	
	
	
	}

//after this kiteappbaseclass//

