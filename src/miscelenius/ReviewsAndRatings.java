package miscelenius;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewsAndRatings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
      driver.findElement(By.name("q")).sendKeys("boat");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
     driver.findElement(By.xpath("//button[text()='✕']")).click();
      
      





	}

}
