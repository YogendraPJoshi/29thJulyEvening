package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("software testing");
		
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		

	}

}
