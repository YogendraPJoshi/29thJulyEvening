package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prequoteLite 
{
	@FindBy(xpath = "(//i[@class='radio'])[1]") private WebElement maleRadioButton;
	@FindBy(name = "nameAdd") private WebElement nameField;
	@FindBy(id = "dob") private WebElement dob;
	@FindBy(id = "mobileNo") private WebElement mobNumField;
	@FindBy(name = "submitButton") private WebElement submitButton;
	
	public prequoteLite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void radioSelect()
	{
		maleRadioButton.click();
	}
	
	public void enterName()
	{
		nameField.sendKeys("Yogendra Joshi");
	}
	
	public void enterDOB()
	{
		dob.sendKeys("02/06/1990");
	}
	
	public void enterMobNum()
	{
		mobNumField.sendKeys("9421357890");
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}

}
