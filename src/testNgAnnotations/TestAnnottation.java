package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnottation {
  @Test
  public void z()
  {
	  Reporter.log("TC z is running", true);
  }
  @Test
  public void x()
  {
	  Reporter.log("TC x is running", true);
  }
  
  @Test
  public void y()
  {
	  Reporter.log("TC y is running", true);
  }
}
