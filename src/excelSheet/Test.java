package excelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.name("firstname"));
		
		name.sendKeys("Velocity");

	}

}
