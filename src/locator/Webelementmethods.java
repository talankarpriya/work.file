package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("talankarpriya");//when we hsve declaire at one time
		//Thread.sleep(500);
	
		//driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email"));
		username.sendKeys("talankarpriya");                     //when multiple times actions we have taken
		Thread.sleep(1000);
		username.clear();
		
		
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		
		
		
	}

}
