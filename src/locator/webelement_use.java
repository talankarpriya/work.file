package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("cham cham");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Cham Cham Full Video | BAAGHI |')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
        Thread.sleep(1200);
        
     //  driver.findElement(By.xpath())
	}

}
