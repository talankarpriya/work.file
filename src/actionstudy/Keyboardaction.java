package actionstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
         Thread.sleep(1000);
         
       WebElement textbox = driver.findElement(By.id("autocomplete"));
         
         textbox.sendKeys("velocity");
          Actions act=new Actions(driver);
          act.sendKeys(textbox,"pune").perform();
          
          act.keyDown(textbox,Keys.SHIFT).sendKeys("priya").keyUp(Keys.SHIFT).sendKeys("darshani").build().perform();
          
          
          
          
         
         
         
		}

}
