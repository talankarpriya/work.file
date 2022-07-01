package drop_dowm;



import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		TreeSet<String>ts=new TreeSet<String>();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		Thread.sleep(5000);
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(2000);
		
		Select s = new Select(month);
		
		List<WebElement>availablemonth= s.getOptions();
		
		for(WebElement we:availablemonth)
		{
			String text=we.getText();
			ts.add("text");
	}
		System.out.println(ts);
		
		for(String s1:ts)
		{
			System.out.println(s1);
			
			
			
		}
		
		

	}
}
		
		
	


