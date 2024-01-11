package chromeOptionsClassStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		
		
		WebElement popUp2Close = driver.findElement(By.xpath("//a[@class='close']"));
		Thread.sleep(1000);
		if(popUp2Close.isDisplayed())
		{Thread.sleep(1000);
			popUp2Close.click();
		}
		Thread.sleep(1000);
		WebElement popUpClose = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		Thread.sleep(1000);
		if(popUpClose.isDisplayed())
		{Thread.sleep(1000);
			popUpClose.click();
		}
		driver.findElement(By.xpath("//li[@class='menu_Flights']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("fromCity")).sendKeys("TIR");
		Thread.sleep(500);
		List<WebElement> cities = driver.findElements(By.xpath("//div[@role='listbox']"));
		Thread.sleep(500);
		for(WebElement city:cities)
		{
			if(city.getText().equalsIgnoreCase("TIRUPATI, India"))
			{
				city.click();
				break;
			}
		}
		
	}

}
