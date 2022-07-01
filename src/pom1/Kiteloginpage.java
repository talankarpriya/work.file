package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {

	
		//1.data member/variables//
	
		@FindBy(id="userid") private  WebElement UN;//data members should be private
		@FindBy(id="password") private WebElement pwd;
		@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
		
		// 2.constructor
		
		public Kiteloginpage(WebDriver driver)//acess specifier should be public 
		{
			//initialise  global variables/elements from same class,but here we use public hence use this keyword
			//to acess global variable at one time 
			PageFactory.initElements(driver, this);//classname.method name//here we initialise the webdriver
		}
			//3. method
			
		public void SendUserName()//here we have not declare methods with parameter
		{
			
			UN.sendKeys("ELR321");
		}
		public void SendPassword()
		{
			pwd.sendKeys("Dhana1111") ;
			
		}
		public void ClickOnLoginButton()
		{
			loginbutton.click();
			
			
		}

}
