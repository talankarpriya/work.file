package xmlstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest {
	//i want 1,3,5,i dont want 2,4
	@Test
	public void mymethod1()
	{
		Reporter.log("my method1 is rnning", true);
		
	}
	@Test
	public void mymethod2()
	{
		Reporter.log("my method2 is running", true);
		
	}
	@Test
	public void mymethod3()
	{
	Reporter.log("my method 3 is running", true);
	
	}
	@Test
	public void mymethod4()
	{
		Reporter.log("my method 4 is running", true);
	}
	@Test
	public void mymethod5()
	{
		Reporter.log("my method 5 is running", true);
		
	}

}
