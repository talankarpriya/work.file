package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https:\\www.vctcpune.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.irctc.co.in/");
		driver.navigate().refresh();
			

	}

}
