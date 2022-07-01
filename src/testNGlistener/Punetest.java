package testNGlistener;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Punetest 
{
	@Test
	public void swargate()
	{
		Assert.fail();
		Reporter.log("swargate tc is running",true);
	}
@Test
public void shivajinagar()
{
	Reporter.log("shivajinagar tc is running",true);
}
}
