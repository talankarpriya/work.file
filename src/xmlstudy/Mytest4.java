package xmlstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest4 {
	@Test(groups="regression")
	public void mymethod6()
	{
		Reporter.log("mymethod 6 regression is running", true);

	}
	@Test(groups="sanity")
	public void mymethod7()
	{
		Reporter.log("mymethod7 sanity is running", true);
	}
@Test
public void mymethod8()
{
	Reporter.log("mymethod8 is running", true);
}
@Test
public void mymethod9()
{
	Reporter.log("mymethod9 is running", true);
}
@Test
public void mymethod10()
{
	Reporter.log("mymethod10 is running", true);
}
}
