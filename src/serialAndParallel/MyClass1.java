package serialAndParallel;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void Tc1() 
  {
	  Reporter.log("TC 1 is running", true);
  }
  
  @Test
  public void Tc2() 
  {
	  
	  Reporter.log("TC 2 is running", true);
  }
  
  @Test
  public void Tc3() 
  {
	Assert.fail();
	  Reporter.log("TC 3 is running", true);
  }
  
  @Test
  public void Tc4() 
  {
	  Reporter.log("TC 4 is running", true);
  }
  @Test
  public void Tc5() 
  {
	  Reporter.log("TC 5 is running", true);
  }
}
