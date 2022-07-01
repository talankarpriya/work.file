package xmlstudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class my_test {
	//i want 1 3 5,idont want 2,4
	@Test
	public void mymethod1()
	{
		Assert.fail();
		Reporter.log("my method1 is running", true);
		
	}
@Test
public void mymethod2()
{
	Reporter.log("my method2 is running", true);
}
@Test
public void mymethod3()
{
	//Assert.fail();
	Reporter.log("mymethod3 is running", true);
}
@Test
public void mymethod4()
{
	//Assert.fail();
	Reporter.log("mymethod4 is running", true);
}
@Test
public void mymethod5()
{
	//Assert.fail();
	Reporter.log("mymethod5 is running", true);
}

}
