package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		boolean result = checkbox.isSelected();
System.out.println("result is"+result);
	}

}
