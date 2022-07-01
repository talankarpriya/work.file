package drop_dowm;          //is multiple//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iismultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
	Thread.sleep(5000);
	
	WebElement month = driver.findElement(By.id("month"));
	Thread.sleep(2000);
	
	Select s= new Select(month);
	s.selectByVisibleText("Jan");
	Thread.sleep(2000);
	
	s.selectByVisibleText("Aug");
	Thread.sleep(2000);
	
	System.out.println(s.isMultiple());
	
	
	

	}

}
