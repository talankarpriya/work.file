package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_use {
	@Test(priority=-3)
	public void D()
	{
		Reporter.log("D is running", true);
	}
	@Test(priority=-3)
	public void C()
	{
		Reporter.log("C is running", true);
	}
	@Test(priority=-1)
	public void A()
	{
		Reporter.log("A is running", true);
	}
	@Test(priority=-2)
	public void B()
	{
		Reporter.log("B is running", true);
		
	}
	

}
// tesng gives in alphabetical order ifduplicates are given
//for skipping tc take enabled=false also