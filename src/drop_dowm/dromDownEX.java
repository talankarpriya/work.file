package drop_dowm;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dromDownEX {

	

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
	



			////1) decide list box to handle and store in reference variable
             Thread.sleep(2000);
         WebElement day = driver.findElement(By.id("day"));//step1
     
    //sttep2=create an object of select class and pass reference variable
            Select s = new Select(day);//step2 day passed in select
            Thread.sleep(5000);
            
            //step3 use select object and call any of three metods as per need
         
            s.selectByValue("10");//VALUE 10 IS PASSED
                        List<WebElement> dayoptions = s.getOptions();
           System.out.println(dayoptions.size());
           s.selectByValue("10");
           Thread.sleep(5000);
             
             WebElement month = driver.findElement(By.name("birthday_month"));     
             Select s1=new Select(month);
             Thread.sleep(2000);
            s1.selectByIndex(3);
            Thread.sleep(5000);
             
             WebElement year = driver.findElement(By.id("year"));
                     Select s2 = new Select(year);
                     Thread.sleep(2000);
             s2.selectByVisibleText("2007");
             Thread.sleep(2000);              
              s2.selectByVisibleText("2010") ;
            
          //System.out.println(s2.getFirstSelectedOption().getText());
              Thread.sleep(5000);
           
            s2.deselectByVisibleText("2010");
            
	}	
		
	}

