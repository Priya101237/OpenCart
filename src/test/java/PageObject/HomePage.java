package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")
	WebElement lnklogin;
	
	
	
	public void ClickMyAccount()
	{
		lnkMyAccount.click();
	}
	
	public void ClickRegister()
	{
		lnkRegister.click();
	}
	
	public void ClickLogin()
	{
		lnklogin.click();
	}
	
}
