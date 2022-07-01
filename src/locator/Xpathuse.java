package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();//atribute()
		//driver.findElement(By.xpath("\\input[text()='Radio1']")).click();//text()
	//	driver.findElement(By.xpath("\\input[\\h1[contains(text(),'welcome')]")).click();//contains method with text()
        //driver.findElement(By.xpath("\\div[contains(@pseudo,'-webkit')]")).click();
	}
}