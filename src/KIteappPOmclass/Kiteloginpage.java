package KIteappPOmclass;


import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locator.webelement_use;
//data members/variables
public class Kiteloginpage {
	//1.data members/variables
	@FindBy(id="userid") private WebElement UN;//pom follows encapsulation method so that data members private globally
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
  // @FindBy(xpath="//a[text()='Change user']")private WebElement changeuser;
	//2.constructor
	
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3.method
	public void sendusername( String login)
	//here we have to declare methods with parametr of strig type//
	{
		UN.sendKeys(login);
	}
	public void sendpassword(String pssword)
	{
	PWD.sendKeys(pssword);
	}
	public void ClickOnLoginButton()
	{
		loginbutton.click();
	}

//	public void ClickOnchangeuser() {
//		changeuser.click();		
//	}
}
	
	
	
	
	

