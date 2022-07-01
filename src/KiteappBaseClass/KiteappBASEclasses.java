package KiteappBaseClass;//1//

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteappBASEclasses 
{
	 protected WebDriver driver;

	//browser setup
	//i want seperate  method for browser calling
public void openbrowser()
	{//browser seting
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 
	 
	
		
	}

}
////////////create method in base class for opening browser/////////
//after this kiteapputilityclass//