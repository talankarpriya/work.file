package sceenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
public class screenshotwithrandomname {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
		
		String random = RandomString.make(3);
	File dest=new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\screenshot1\\"+random+".png");
	
	FileHandler.copy(source, dest);
	
	
	}
	

}
