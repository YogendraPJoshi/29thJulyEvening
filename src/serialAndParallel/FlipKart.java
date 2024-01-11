package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipKart {

	@Test
	public void flipkartTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
