package sceenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotuse {



	public static void main(String[] args, TakesScreenshot  source) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To take screenshot using selenium webdriver, we need to type cast driver 
		//object to Takes Screenshot interface.
		//Then we need call function getscreenshotAs(); there we need to pass the 
		//argument 
		//"Outputtype. FILE"
		
		
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\screenshot1\\.png");
		 FileHandler.copy(Source, destination);
	}
}