package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFB {
  @Test
  public void f() throws InterruptedException 
  {
	  {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
	WebElement femaleRadioButton =driver.findElement(By.xpath("//label[text()='Female']"));
			
	boolean beforeSelection = femaleRadioButton.isSelected();
	 
	Assert.assertFalse(beforeSelection,"gender is selected TC is failed");
	Thread.sleep(1000);
	femaleRadioButton.click();
	Thread.sleep(1000);
	boolean afterSelection =femaleRadioButton.isSelected();

	Assert.assertTrue(afterSelection,"gender not selected TC is failed");
	  }
  }
}
