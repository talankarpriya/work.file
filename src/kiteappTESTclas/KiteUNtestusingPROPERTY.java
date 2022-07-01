package kiteappTESTclas;//test class created in testng

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KIteappPOmclass.Kiteloginpage;
import KIteappPOmclass.KitepinPage;
import KiteAppUtilityForPropertyFile.UtilityUsingPropertFile;
import KiteappBaseClass.BaseclassusingPROPERTY;
import kitewithexcel.KitehomePage;

public class KiteUNtestusingPROPERTY extends BaseclassusingPROPERTY {
	Kiteloginpage login;
	KitepinPage pin;
	KitehomePage home;
@BeforeClass
  public void launchbrowser() throws IOException
{
	openbrowser();
	//we have to initialise the methods after that we can use that method
	login=new Kiteloginpage(driver);
	pin=new KitepinPage(driver);
	home=new KitehomePage(driver);
  }

@BeforeMethod
public void logintokiteapp() throws IOException
{
	login.sendusername(UtilityUsingPropertFile.readdatafromproperty("UN"));
	login.sendpassword(UtilityUsingPropertFile.readdatafromproperty("PWD"));
	login.ClickOnLoginButton();
	UtilityUsingPropertFile.implicitwait(driver,200);
	
	pin.sendpin(UtilityUsingPropertFile.readdatafromproperty("PIN"));
	pin.clickoncontinuebutton();
	UtilityUsingPropertFile.implicitwait(driver, 200);
}
	@Test
	public void validateusername() throws IOException
	{
		String actualuserID = home.getactualuserid();
		String expecteduserID = UtilityUsingPropertFile.readdatafromproperty("UN");
		
		Assert.assertEquals(actualuserID,expecteduserID,"exp and act are not matching tc is failed" );
		Reporter.log( "exp userID and act userID are matching, tc is passed",true);
		UtilityUsingPropertFile.takeScreenshot(driver);
	}
	
		
@AfterMethod
	public void logoutfromkite() throws InterruptedException
	{
		home.clickonlogoutbutton();
	}

@AfterClass
public void closebrowser() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
	
}

}
