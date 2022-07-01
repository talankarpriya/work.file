package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.discoveryplus.in/");
    
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
Thread.sleep(1000);
     
    WebElement otpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
    boolean result = otpbutton.isEnabled();
    System.out.println("getotp button is"+result);

    
    


    


	}
	}
	
