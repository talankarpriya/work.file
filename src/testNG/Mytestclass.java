package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytestclass {
  @Test
  public void method1() throws InterruptedException {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		System.out.println("method1 is running");//it desplay in only console
  }
		
	@Test
	public void method2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Reporter.log("method2 is running");//it desplay in only emailing report
	}
	@Test
	public void method3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Reporter.log("method3 is running", true);//it desplay in both console and emailing report
		
//testNG is java unit framework use to design/writting test cases
		//basically testNG gives report of test case execution
		//annotate the mothod with @test annotaton

		
		
		
  
  }
}
