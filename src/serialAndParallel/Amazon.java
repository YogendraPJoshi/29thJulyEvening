package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void amazonTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
