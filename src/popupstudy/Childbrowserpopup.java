package popupstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.findElement(By.name("NewWindow")).click();
	
	//we cannot use switch to method for handle child window  bcz we dont know the id of windowso we get "windowhandle " method here
	
	String idofmainpage = driver.getWindowHandle();//because we have to handle single window
	
	System.out.println(idofmainpage);//we get id of main page in console
	Thread.sleep(100);
	
	Set<String> allids = driver.getWindowHandles();//id of multiple windows
	Thread.sleep(100);
			//it returns set of string
	
//	for(i=0;i<=allids.size()-1;i++)
//	{
//		System.out.println(allids.getClass());//here we not get get() but to get allids in console we require get() so that we  have to create object of arralist()
	//arraylist is nothing but implemented methpd of list in collection 
//	}
//			
//	set need to convert arraylist()
	ArrayList<String> ar=new ArrayList<>(allids);
	
	for(int i=0;i<=ar.size()-1;i++)
	{
		System.out.println(ar.get(i));//here we get get() when we create arralists object
	}
	
	//Iterator<String> it = allids.iterator();
	String mainpageid = ar.get(0);
	String childpageid = ar.get(1);
	//to switch to child page
	
	driver.switchTo().window(childpageid);
	Thread.sleep(100);
	//to maximise child window
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("the7-search")).sendKeys("selenium");
	driver.close();
	driver.quit();
	
	
	
	
			
			
			
			
			
	}

}
