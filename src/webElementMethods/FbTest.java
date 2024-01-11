package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%7C&placement=&creative=589460569849&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw7JOpBhCfARIsAL3bobeVk_OkIsbSd0RnXwBbYv5REgdLnS-beZLBR5ThqANw75EGqraIAvoaAlEAEALw_wcB");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Velocity");
		
	}

}
