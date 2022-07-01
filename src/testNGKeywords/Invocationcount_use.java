package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocationcount_use {
//no main method
	@Test(invocationCount=3)
	 
	public void mymethod()//method
	{
		Reporter.log("my method is running", true);
	}
	
	@AfterMethod
	public void close()
	{
		Reporter.log("closing browser", true);
	
	}
	

}
