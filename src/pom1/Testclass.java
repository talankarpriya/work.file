package pom1;//page object module

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	       driver.get("https://kite.zerodha.com/");
	      //on login page username,passand submitt are perform  for initialised the variables we create an object and call methods
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	      
	      Kiteloginpage login=new Kiteloginpage(driver);//creating object of kitelogin class
	      
	      login.SendUserName();
	      login.SendPassword();
	      login.ClickOnLoginButton();
	      
	      //nevigate on pin page ,create object of pinno. class,and call methods ehich declare in kitepin class
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	       Kitepinno pin=new Kitepinno(driver);//kitepinno mehod have parameter
	       
	       pin.SendPin();
	       pin.Clickoncontinue();
	       
	      
	      
	      
	}

}
