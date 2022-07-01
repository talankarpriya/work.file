package kiteappTESTclas;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KIteappPOmclass.KitehomePage;
import KIteappPOmclass.Kiteloginpage;
import KIteappPOmclass.KitepinPage;
import KiteappBaseClass.KiteappBASEclasses;
import KiteappUtility.Utility;
//testNG class//
   public class validaekiteuserID extends KiteappBASEclasses {
	 //variable declairing
	  Kiteloginpage login;
	  KitepinPage pin;
	  KitehomePage home;
	 //here webdriver driver not come it declair in base class
	
 @BeforeClass
	public void launchbrowser()
	{
		openbrowser();
		//initialise variables
		login=new Kiteloginpage(driver);
		pin=new KitepinPage(driver);
		home=new KitehomePage(driver);
	}
@BeforeMethod	
     public void logintokiteapp() throws EncryptedDocumentException, IOException
     {//in utility class we give static method 
	    login.sendusername(Utility.readdatafromexel(1, 0));//validate data from excel
	    login.sendpassword(Utility.readdatafromexel(1, 1));
	    login.ClickOnLoginButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	    pin.sendpin(Utility.readdatafromexel(1, 2));
	    pin.clickoncontinuebutton();
     }
@Test
    public void validateusername() throws EncryptedDocumentException, IOException
    {
	   String actualusername = home.getactualuserid();//what we want in o/p
	   String expectedusername = Utility.readdatafromexel(1, 0);//in exel sheet
	   
	   Assert.assertEquals(actualusername, expectedusername,"tc is failed actual and expected username not matching");
       //getAssert for testNG class
	   Reporter.log("username are matching tc is passed", true);
	   Utility.takeScreenshot(driver);
    }
@AfterMethod
    public void logouFromKiteApp() throws InterruptedException
  {
	  home.clickonlogoutbutton();
	  //click on change user name //for change user we have to create one pom method in pom class for that and give @test inthis class
}
@AfterClass
     public void closebrowser()
   {
	  driver.close();
}

}
