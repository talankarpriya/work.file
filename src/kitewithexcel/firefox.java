package kitewithexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}

}
