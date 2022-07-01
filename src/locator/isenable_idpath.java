package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable_idpath {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(100);
		
	WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Log In']"));//without entering usernm and pass
	boolean result = loginbutton.isEnabled();
	System.out.println("login buttn status is"+result);
	
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("talankarpriya");
		Thread.sleep(1000);
		
	    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("priyadarshani");
	    Thread.sleep(1000);
	    
	    
	    boolean result1 = loginbutton.isEnabled();//with entering usrnm and pass
	    System.out.println("login button status is"+result1);
	    
	   // if(loginbutton.isEnabled());
	   // {
	   // loginbutton.click();	
	    
	  //  }
	   // else {
	    //	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("talankarpriy");
			
	    
	    //if(loginbutton.isEnabled());
	  //  {
	   // 	loginbutton.click();
	   // }
	//else{
	   
	}
}


	


