package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JeevanStahiIDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		boolean result = driver.findElement(By.id("reg_caste_chzn")).isDisplayed();
	
		System.out.println("Cast status is "+result);
		
		
		//selecting religion
		
		WebElement religion = driver.findElement(By.id("reg_religion_chzn"));
		
		Select s= new Select(religion);
		s.selectByValue("1");
	
	}

}
