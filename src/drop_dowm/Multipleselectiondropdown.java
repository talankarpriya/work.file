package drop_dowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselectiondropdown {

	private static final int i = 0;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement dropdownbox = driver.findElement(By.name("cars"));
		
		//1.create object of select class
		
		Select s=new Select(dropdownbox);
		
		//2.check is multiple
		boolean result = s.isMultiple();
		System.out.println("ismultiple result is"+result);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		//how to deselect
		//s.deselectall();//can be used only for multiple selectable
		s.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		System.out.println(s.getFirstSelectedOption().getText());//when we have to select multiple texts
		WebElement firstwebelement = s.getFirstSelectedOption();
		String mytext = firstwebelement.getText();
		
		System.out.println("1st selected option is"+mytext);
		System.out.println(s.getAllSelectedOptions().size());
		Thread.sleep(1000);
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++);
		{
		System.out.println(s.getAllSelectedOptions().get(i).getText());
		
		
		
		
		
		
		}
		}	
		
		
		
		

	}


