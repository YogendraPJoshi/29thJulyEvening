package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("MUmbai");
		
//		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Banglore");
//		driver.findElement(By.xpath("//h2[contains(text(),'your life.')]")).click();
		

	}

}
