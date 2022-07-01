
package popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Thread.sleep(1000);
		//to handle alert popup me need to chang eselenium focuf from main page
		
		Alert alt = driver.switchTo().alert();
		
		// which contain abstract methdsalet is an interface
		System.out.println(alt.getText());
		alt.accept();//use to click on ok button
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		
		

	}

}
