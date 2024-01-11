package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		
		System.out.println("Title is "+title);
		
		
		
		

	}

}
