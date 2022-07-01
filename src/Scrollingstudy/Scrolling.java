package Scrollingstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		// +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 
		// +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 
//		j.executeScript("window.scrollBy(80,900)");
//		Thread.sleep(2000);
//		j.executeScript("window.scrollBy(80,2000)");

	}

}
