package drop_dowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdownex2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://en-gb.facebook.com");
     driver.manage().window().maximize();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep (5000);
		
		WebElement Month = driver.findElement(By.id("month"));
		Thread.sleep(5000);
		
		Select s= new Select(Month);
		s.selectByVisibleText("Jan");
		Thread.sleep(5000);
		
		s.selectByVisibleText("Aug");
		Thread.sleep(5000);
		
		System.out.println(s.isMultiple());
		


	}

}
