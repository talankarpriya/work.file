package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class web_element_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testbook.com/online-test-series");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//div[@id='test-series-search-box']")).sendKeys(args);
	
		
		
		
		
	
	
	}
       ////////////    //    //incomplete project/////////////////////////
}
