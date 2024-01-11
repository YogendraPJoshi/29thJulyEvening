package policyBazaar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePolicyBazzarNumberOfQuotes {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PolicyBazaarHomePage home= new PolicyBazaarHomePage(driver);
		Thread.sleep(500);
		home.clickOnHomePageSignInButton();
		Thread.sleep(500);
		home.enterMobileNumber();
		Thread.sleep(500);
		home.clickOnSignInWithPasswordButton();
		Thread.sleep(1000);
		
		PolicyBazaarHomePage1 home1=new PolicyBazaarHomePage1(driver);
		Thread.sleep(500);
		home1.enterPassword();
		Thread.sleep(500);
		home1.clickOnSignInButtonAfterPassword();
		Thread.sleep(500);
		home1.clickOnTermLifeInsurance();
		Thread.sleep(500);
		
		PolicyBazaarPrequoteLitePage preQuoteLite= new PolicyBazaarPrequoteLitePage(driver);
		Thread.sleep(500);
		preQuoteLite.clickOnGenderSelectionRadioButton();
		Thread.sleep(500);
		preQuoteLite.enterName();
		Thread.sleep(500);
		preQuoteLite.enterDOB();
		Thread.sleep(500);
		preQuoteLite.enterMobileNumerOnPreQuoteLite();
		Thread.sleep(500);
		preQuoteLite.clickOnview_Free_Quote_Button();
		Thread.sleep(500);
		
		PolicyBazaarQuotesPage quotes= new PolicyBazaarQuotesPage(driver);
		Thread.sleep(1000);
		quotes.validateNumberOfQuotes();
		
		

	}

}
