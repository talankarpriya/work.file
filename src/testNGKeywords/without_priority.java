package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class without_priority {
	@Test(priority=0)
	public void c()
	{
		Reporter.log("c is running", true);
	}
	@Test(priority=-2)
	public void a()
	{
		Reporter.log("a is running", true);
	}
	@Test
	public void b()
	{
		Reporter.log("b is running", true);
	}

}
