package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)

public class MyClass2 {
  @Test
  public void e() 
  {
	  Reporter.log("Hi e is running", true);
  }
  @Test
  public void f() 
  {
	  Assert.fail();
	  Reporter.log("Hi f is running", true);
  }
  @Test(dependsOnMethods  = {"f"})
  public void g() 
  {
	  Reporter.log("Hi g is running", true);
  }
  @Test
  public void h() 
  {
	  Reporter.log("Hi h is running", true);
  }
}
