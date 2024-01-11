package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		RandomString s= new RandomString();
//		String rs = s.make(4);
		
		LocalDateTime ld= LocalDateTime.now();
		
	
		File dest= new File("D:\\Velocity\\Java Class\\29th July Even\\screenShot\\myScreenShot"+ld+".png");
		
		FileHandler.copy(source, dest);
		
	}

}
