package Iframesample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switch selenium focus from main page to frame//
		driver.switchTo().frame("iframe-name");
		Thread.sleep(200);
		//current focus on frame
		
		driver.findElement(By.xpath("//a[text()='About us'][1]")).click();
		//take action on main page again we need to switch selenium focus to main page
		
		//switch to parant frame(); or switch to  default content();
		driver.switchTo().parentFrame();//switching selenium focus to main page
		Thread.sleep(200);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		
	}

}

