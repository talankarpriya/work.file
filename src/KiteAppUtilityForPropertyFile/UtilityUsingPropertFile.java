package KiteAppUtilityForPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.poifs.property.Property;
import org.bouncycastle.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
//in this utility class we have to take only screenshot method and not given excel file method bcz this time we have to fetch data from property file not from excel file
public class UtilityUsingPropertFile 

{
	public static void takeScreenshot(WebDriver driver) throws IOException//webdriver locally gheun parameterise kel
	 {
		 //source file
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String random = RandomString.make(3);//for randomly taking screenshot
		 //destination file
	     File dest=new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\screenshot1"+random+".png");
		 
	     FileHandler.copy(src, dest);
		
	 }
	public static String readdatafromproperty(String key) throws IOException
	{
		java.util.Properties prop=new java.util.Properties();
		FileInputStream myprop = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\first_selenium\\myproprty.properties");//getting mypropert file path
		prop.load(myprop);//loading property 
		String value = prop.getProperty(key);
		
		
		return value;
	}
	public static void implicitwait(WebDriver driver,int timeunit)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	
		
		
		
	}

}
