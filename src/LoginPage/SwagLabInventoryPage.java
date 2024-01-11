package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage 
{
	
	//1.variables
	
	@FindBy(id = "shopping_cart_container")private WebElement cartButton;
	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tShirtsAddToCartButton;
	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")  private WebElement jacketAddToCartButton;
	
	
	//2.constructor
	public SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void addTshortToCart()
	{
		tShirtsAddToCartButton.click();
	}
	
	public void jacketAddToCart()
	{
		jacketAddToCartButton.click();
	}
	
	public void clickOnCartButton()
	{
		cartButton.click();
	}

}
