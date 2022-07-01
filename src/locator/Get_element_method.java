package locator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_element_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		System.out.println("element1.gettext()");//we cwn writen without reference vwriable
		
		String actualText = element1.getText();// string reference variable created
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		
		if(actualText.equals(expectedText))
		{
			System.out.println("text is matching and tc is passed");
			
		}
		else
		{
			System.out.println("text is not matchin and tc is failed");
		}
		//System.out.println("mytext");
		
	}

}
