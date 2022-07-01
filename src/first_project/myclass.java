package first_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//webdriver get()method
		driver.get("https://vctcpune.com");
		
		driver.getTitle();//getTile method
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();//maximise and minimize method
		driver.manage().window().minimize();
		
		driver.navigate().to("https:https://www.youtube.com/");//navigate method
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.close();//close method
		driver.quit();//quit method
	}

}
