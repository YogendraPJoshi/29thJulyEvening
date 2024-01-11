package policyBazaar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoverFox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		Thread.sleep(500);//page change
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(500);//page change
		WebElement ageDropDown = driver.findElement(By.id("Age-You"));
		Select s= new Select(ageDropDown);
		s.selectByValue("33y");
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(500);//page change
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("411046");
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9421357890");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		Thread.sleep(1000);//page change
		List<WebElement> planList = driver.findElements(By.id("plans-list"));
		int totalSuggestedPlans = planList.size();
		System.out.println("Total suggested plans are "+planList.size());
		
		String matchingPlans = driver.findElement(By.xpath("//div[contains(text(),'matching Health')]")).getText();
		System.out.println("matching plans details "+matchingPlans);
		
		String[] result = matchingPlans.split(" ");
		
				
		String matchingNumberInString = result[0];
		
		int matchingNumberInInt = Integer.parseInt(matchingNumberInString);
		
		if(totalSuggestedPlans==matchingNumberInInt)
		{
			System.out.println("Plans number matching with plans List");
		}
		else {
			System.out.println("Plans number is not matching with plans List");
		}
		
		
		//apply Brand filter
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='filter-sec'])[3]//div[@class='fc-filter']")).click();
	}

}
