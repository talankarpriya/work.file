package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.vctcpune.com/");
     
     driver.manage().window().maximize();

     WebElement element1 = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center'])"));
    String actualtext = element1.getText();
    String expectedtext="VELOCITY CORPORATE TRAINING CENTER";
    
    if(actualtext.equals(expectedtext))
    {
    	System.out.println("testcase1 is passed");
    }
    else
    {
    	System.out.println("Testcase1 is failed");
    }
}

}
