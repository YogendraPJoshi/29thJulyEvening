package policyBazaar;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarQuotesPage 
{
	@FindBy(xpath = "//div[@class='card_Row']") private List<WebElement>quotes;

	public PolicyBazaarQuotesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateNumberOfQuotes()
	{
		System.out.println("Number of quotes are "+quotes.size());
	}
	
}
