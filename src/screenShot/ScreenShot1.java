package screenShot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String destination = System.getProperty("user.dir") + "/ScreenShot/"  +"Mytest "+timeStamp+".png";
		File dest= new File(destination);
	
		FileHandler.copy(source, dest);
	}

}
