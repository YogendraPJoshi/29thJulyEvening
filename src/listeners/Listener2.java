package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener2 implements ITestListener
{
	
@Override
public void onTestSuccess(ITestResult result)
{
	String TCName = result.getName();
	Reporter.log("TC " +TCName+" is completed successfully Listener 2", true);
	
}


@Override
	public void onTestStart(ITestResult result)
{
		Reporter.log("TC "+result.getName()+" execution is started Listener 2", true);
}
	
}
