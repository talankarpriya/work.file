package kitewithexcel;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.hssf.usermodel.NewSheet;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class KiteTestCrossbrowser {
	Kiteloginpage login;
	KitepinPage pin;
	KitehomePage home;//object creation
	protected  WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet mysheet;
	
	@Parameters("browser")//we take argument as a broser bcz we want to perform action on diff browser
	@BeforeClass
	public void launchbrowser(String browser) throws EncryptedDocumentException, IOException
	{
	//WebDriver driver;	 
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();//webdriver=driver declair previously
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching url", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new Kiteloginpage(driver);
		home=new KitehomePage(driver);
		// KitepinPage pin=new KitepinPage(driver);
		pin=new KitepinPage(driver);//object creation
		
		//////path of excel file/////
		File myfile=new File("C:\\Users\\admin\\Desktop\\exelreading\\exelread.xlsx");
		  mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
	}
	
	@BeforeMethod
	public void logintokite()
	{/////for login page use object login//////
		login.sendusername(mysheet.getRow(1).getCell(0).getStringCellValue());
		Reporter.log("sending username", true);
		
		login.sendpassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		Reporter.log("sending password", true);
		
		login.ClickOnLoginButton();
		Reporter.log("click on login button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		/////for pin page use object pin////
		pin.sendpin(mysheet.getRow(1).getCell(2).getStringCellValue());;
		Reporter.log("sending pin", true);
		
		pin.clickoncontinuebutton();
		Reporter.log("clicking on continue button", true);
	}
	@Test
	public void verifykiteusername()
	{
		//expected usernam=exel
		//actual username??
		String expecteduserid = mysheet.getRow(1).getCell(0).getStringCellValue();
		String actualuserid = home.getactualuserid();
		Reporter.log("validating userid", true);
		Assert.assertEquals(actualuserid, expecteduserid,"actualuserid nd expecteduserid are not same tc is failed");
	    Reporter.log("expected and actual userid are matching tc is pass", true);
	}
	@AfterMethod
	public void logoutfromkiteapp() throws InterruptedException
	{
		home.clickonlogoutbutton();
		Reporter.log("logging out", true);
	}
	@AfterMethod
	public void closebrowser()
	{
		Reporter.log("closing browser", true);
		driver.close();
		
	}
	
 
}
