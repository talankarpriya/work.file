package xmlstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest3 {
	
		@Test(groups="sanity")
		public void mymethod1()
		{
			Reporter.log("my method1 sanity is rnning", true);
			
		}
		@Test
		public void mymethod2()
		{
			Reporter.log("my method2 is running", true);
			
		}
		@Test(groups="regression")
		public void mymethod3()
		{
		Reporter.log("my method 3  regression is running", true);
		
		}
		@Test
		public void mymethod4()
		{
			Reporter.log("my method 4 is running", true);
		}
		@Test(groups="regression")
		public void mymethod5()
		{
			Reporter.log("my method 5 regression is running", true);
		}

}
