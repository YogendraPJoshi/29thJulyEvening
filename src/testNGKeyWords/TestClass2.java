package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @Test(invocationCount = 5)
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
}
