package KiteappBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAppUtilityForPropertyFile.UtilityUsingPropertFile;

public class BaseclassusingPROPERTY {
	 protected WebDriver driver;

		//browser setup
		//i want seperate  method for browser calling
	public void openbrowser() throws IOException
		{//browser seting
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(UtilityUsingPropertFile.readdatafromproperty("url"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		}	 
		 
}
