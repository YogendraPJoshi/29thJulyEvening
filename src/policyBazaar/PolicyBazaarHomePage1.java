package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarHomePage1
{
	@FindBy(xpath = "//input[@type='password']")private WebElement passwordField;
	@FindBy(id = "login-in-with-password-span") private WebElement login_in_with_password_Button;
	@FindBy(xpath = "//p[text()='Term Life']") private WebElement term_life_Insurance;
	
	public PolicyBazaarHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPassword()
	{
		passwordField.sendKeys("12345698");
	}
	
	public void clickOnSignInButtonAfterPassword()
	{
		login_in_with_password_Button.click();
	}
	

	public void clickOnTermLifeInsurance()
	{
		term_life_Insurance.click();
	}

}
