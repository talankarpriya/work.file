package drop_dowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxEX {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(6000);
		
		//1.Identify list box to be handled and store it in reference variable
       WebElement day = driver.findElement(By.name("birthday_day"));
       
     //2.Create an object of Select class which will accept WebElement as argument
       
       Select s = new Select(day);
       
    // 3. By using one of the select class methods we can select values form list 
       //.args. like 
       // i. selectByVisibleText: selectByVisibleText(String arg0) 
       // ii. selectByIndex: selectByIndex(int arg0) 
       // iii. selectByValue: selectByValue(String arg0)
       
       Thread.sleep(1000);
     s.selectByVisibleText("11");
     Thread.sleep(1000);
     s.selectByIndex(12);
     Thread.sleep(1000);
     s.selectByValue("21");
     Thread.sleep(5000);
     
     
    WebElement month = driver.findElement(By.id("month"));
    Select s1 = new Select(month);
   Thread.sleep(2000);
   
   s1.selectByVisibleText("Mar");
   Thread.sleep(1000);
   s1.selectByIndex(5);
   Thread.sleep(1000);
   s1.selectByValue("3");
   Thread.sleep(6000);
   
   WebElement year = driver.findElement(By.id("1996"));
   Select s2 = new Select(year);
   Thread.sleep(5000);
   
   s2.selectByVisibleText("2022");
   Thread.sleep(1000);
   s2.selectByIndex(2010);
   Thread.sleep(1000);
   s2.selectByValue("1996");
   
  
  
   
   
   
   
   
     
     
     
		
	}

}
