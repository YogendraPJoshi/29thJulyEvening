package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("bdaytime")).click();
//		System.out.println(driver.findElement(By.xpath("//div[@id='calenderContainer']//td[@class='AP0FY']")).getText());
//		Thread.sleep(100);
//		while(!driver.findElement(By.xpath("//div[@id='calenderContainer']//td[@class='AP0FY']")).getText().contains("February"));
//		{
//			//Thread.sleep(500);
//			driver.findElement(By.xpath("//thead//td[@class='Cxn68'][2]")).click();
//		}
	}

}
