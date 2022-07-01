package locator;
                              //by using if else method//


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_use {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
      if(checkbox.isSelected())
	{
	  System.out.println("IsSelected_use.main()");	
	}
      else
      {
    	  System.out.println("selecting checkbox now");
    	  checkbox.click();
    	  
    	  if(checkbox.isSelected())
    	  {
    		  System.out.println("checkbox is selecte now");
    	  }
    	  else
    	  {
    		  System.out.println("failed to select check box");
    		  
    	  }
      }
		

	}

}
