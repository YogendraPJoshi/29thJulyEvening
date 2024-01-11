package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarHomePage
{
	@FindBy(xpath = "//a[@class='sign-in']") private WebElement sign_inButton;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumField;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPasswordButton;
	
	
	public PolicyBazaarHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnHomePageSignInButton()
	{
		sign_inButton.click();
	}
	
	public void enterMobileNumber()
	{
		mobileNumField.sendKeys("8788832150");
	}
	
	public void clickOnSignInWithPasswordButton() throws InterruptedException
	{
		Thread.sleep(1000);
		signInWithPasswordButton.click();
	}
	
	
	
}
