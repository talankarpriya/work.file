package Iframesample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switch selenium focus from main page to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		//switch selenium focus from main page to parant frame
		WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
	System.out.println(parent.getText());
		Thread.sleep(1000);
		
		//switch selenium focus from parent page to child frame
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(1000);
		WebElement child = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	System.out.println(child.getText());
	Thread.sleep(1000);
	
	//default content();
	driver.switchTo().defaultContent();//switching selenium focus to main page
	driver.findElement(By.xpath(""));
	}

}
