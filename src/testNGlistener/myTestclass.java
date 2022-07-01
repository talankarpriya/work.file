package testNGlistener;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGlistener.listener.class)
public class myTestclass {
	@Test
	public void mytest()
	{
		Assert.fail();
	}
	@Test(dependsOnMethods= {"my test"})
	public void mymethod()
	{
		//assert.fail();
		Reporter.log("hi gm",true);
	}
	

}
