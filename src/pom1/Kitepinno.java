package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinno {

	
		//data members/variables
		
		@FindBy(id="pin")  private WebElement PIN;
		@FindBy(xpath="//button[@type='submit']")private WebElement continuebutton;
		
		//constructor//
		
		public Kitepinno(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}//it should close     ......remember
			
			//method----------to take action 2 element=2 method
			public void SendPin()
			{
				PIN.sendKeys("982278");
			}
			public void Clickoncontinue()
			{
				continuebutton.click();
			}
		
		
		
		

			
		}


