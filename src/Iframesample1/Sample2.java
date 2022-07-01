package Iframesample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		//
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();//switching selenium focus to main page
		Thread.sleep(100);
			
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		

	}

}
