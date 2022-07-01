package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("talankarpriya");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9579456986");
	driver.findElement(By.xpath("//button[@name='login']"))	.click();
	
	}

}