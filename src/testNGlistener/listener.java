package testNGlistener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener 
{
	//@Override
	public void ontestfailure(ITestResult result)
	{
		Reporter.log("tc is failed,screenshot taken",true);
		ITestListener.super.onTestFailure(result);
	}
	//@Override
	public void ontestskipped(ITestResult result)
	{
		Reporter.log("tc is skipped,please check dependent tc",true);
		ITestListener.super.onTestSkipped(result);
	}
	//@Override
	public void ontestsuccess(ITestResult result)
	{
		Reporter.log("tc is failed,screenshot taken",true);
		ITestListener.super.onTestSuccess(result);
	}
	
		
	}

