package miscelenius;

import java.sql.ResultSet;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class Publicclass {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		//ul is unordered line inthat we have various li tagname<li> for the elements of search result
		//so we required to take li indivually not need to select all seggesion box
		
		for(WebElement results:searchresult)//to get list in console
		{
		System.out.println(results.getText());
		 String expectedreult="honda amaze";//expected element
		 
		 for(WebElement ResultS:searchresult)//here create loop variable results
		 {
			String actualresult = results.getText();//actual element getting in console
					//if actual=expected
		 
					if(actualresult.equals(expectedreult))
			{
				results.click();
				
				
				break;//by stoping lick action of  search
			}
		 }
			//we have to navigate next page and press search functionality
		 }
			//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
			{
			driver.findElement(By.linkText("Images")).click();
			//or
			
			
			}
driver.findElement(By.linkText("ima")).click();
	
		}
	}
	
		 		
	
 
 
 
 
 
		
 

	
	
