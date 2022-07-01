package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdesplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		boolean result = textbox.isDisplayed();
		System.out.println("textbox result is"+result);
		textbox.sendKeys("hi priya");
		
		driver.findElement(By.id("hide-textbox")).click();
		boolean result1 = textbox.isDisplayed();
		System.out.println("textbox result is"+result1);
		
		

	}

}
