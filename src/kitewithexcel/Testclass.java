package kitewithexcel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile=new File("C:\\Users\\admin\\Desktop\\exelreading\\exelread.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String username = mysheet.getRow(1).getCell(0).getStringCellValue();
		String password = mysheet.getRow(1).getCell(1).getStringCellValue();
	     
	    String pin = mysheet.getRow(1).getCell(2).getStringCellValue();
		
		//login page object
		Kiteloginpage login=new Kiteloginpage(driver);//kitelogin page object
		
		login.sendusername(username);
		//login.sendusername(mysheet.getRow(1).getCell(0).getStringCellValue());
		login.sendpassword(password);
		login.ClickOnLoginButton();
	
		//object of pin page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		KitepinPage PIN=new KitepinPage(driver);//kitepinpage object
		PIN.sendpin(pin);
		
		PIN.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//object of home page
		KitehomePage home=new KitehomePage(driver);
		home.validateuserID(username);
		home.clickonlogoutbutton();
		Thread.sleep(2000);
		//WebElement changeuser = driver.findElement(By.xpath("//a[@class='remove text-xxsmall']"));
		//changeuser.click();
		
				driver.close();
		
		
		
		
		
		
		
	
		
	  
	}

}
