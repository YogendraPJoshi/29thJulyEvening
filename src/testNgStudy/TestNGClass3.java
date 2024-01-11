package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
	
	
	@Test
  public void fbLaunch() 
  {
		WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("FB launching", true);
  }
  
  @Test
  public void intaLaunch()
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("Insta launching", true);
  }
  
  @Test
  public void twitterLaunch()
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://twitter.com/");
	  Reporter.log("Twitter launching", true);
  }
  
  
}
