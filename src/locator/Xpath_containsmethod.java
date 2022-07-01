package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_containsmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
        
        //xpath contains with text//
        driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]") );
     
        
        
	}

}
