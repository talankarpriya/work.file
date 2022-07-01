package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_use {
	@Test
	public void D()
	{
		Reporter.log("D is running", true);
	}
	@Test(enabled=true)//or nothing write bcz by default it is enable= true
	//but if we want to failthe tast case then we can take enabled=false and not use desabled
	public void C()
	{
		Reporter.log("C is running", true);
	}
	
	@Test
	public void B()
	{
		Reporter.log("B is running", true);
	}

}
