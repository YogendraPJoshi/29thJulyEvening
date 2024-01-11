package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarPrequoteLitePage 
{

	@FindBy(xpath = "(//i[@class='radio'])[1]") private WebElement genderRadioButton;
	@FindBy(id = "nameAdd")private WebElement nameField;
	@FindBy(name = "dob")private WebElement dobField;
	@FindBy(name = "mobileNo") private WebElement mobileNumFiledOnPrequote;
	@FindBy(xpath = "(//span[text()='View Free Quotes'])[1]") private WebElement view_Free_Quote_Button;
	
	public PolicyBazaarPrequoteLitePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGenderSelectionRadioButton()
	{
		genderRadioButton.click();
	}
	
	public void enterName()
	{
		nameField.sendKeys("Velocity");
	}
	
	public void enterDOB()
	{
		dobField.sendKeys("15/08/2000");
	}
	
	public void enterMobileNumerOnPreQuoteLite()
	{
		mobileNumFiledOnPrequote.sendKeys("9421357890");
	}
	
	public void clickOnview_Free_Quote_Button()
	{
		view_Free_Quote_Button.click();
	}
	
}
