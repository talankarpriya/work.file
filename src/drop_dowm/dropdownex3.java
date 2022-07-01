package drop_dowm;           //how to gwt selected option//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownex3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(2000);
		Select s=new Select(month);
		Thread.sleep(2000);
         
		WebElement selectedelement = s.getFirstSelectedOption();
		System.out.println(selectedelement.getText());
}
}
