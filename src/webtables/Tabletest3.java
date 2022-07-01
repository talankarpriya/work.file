package webtables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabletest3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//for finding number of rows
		
		 List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int rowsize = rows.size();
		System.out.println("total no. of rows are "+rowsize);
		
		 //for finding no. of columns
		 List<WebElement> columns = driver.findElements(By.xpath("//th"));
			int columnsize = columns.size();
			System.out.println("total no. of columns are "+columnsize);
			
		//for each LOOP columns to get columns	
        for(WebElement chd:columns)
        {
        	//System.out.println(chd.getText());
        	System.out.print(chd.getText()+"||");
        	//System.out.println();
        }
        
        //for each loop for rows
        for(WebElement r:rows)
        {
        	System.out.print(r.getText()+"||");
        	System.out.println();
        }
        System.out.println();
        System.out.println("=======================================");
        
        List<WebElement> third = driver.findElements(By.xpath("//table//tr[3]"));
        
//        for(WebElement tr:third)
//        {
//        	System.out.println(tr.getText()+" ");
//        }
//        
        Iterator<WebElement> tr = third.iterator();
        while(tr.hasNext())
        {
        	System.out.println(tr.next().getText());
        }
        
		 
		
		
		
		
		
		//driver.findElement(By.xpath("//th"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
