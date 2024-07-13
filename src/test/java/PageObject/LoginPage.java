package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
    WebDriver driver;
     public LoginPage(WebDriver driver)
     {
    	 super(driver);
     }
     
     @FindBy(xpath="input-email")
     WebElement txtEmail;
     
     @FindBy(xpath="input-password")
     WebElement txtpassword;
     
     @FindBy(xpath="//button[normalize-space()='Login']")
     WebElement btnlogin;
     
   
     
     
     public void setEmail(String email)
     {
    	 txtEmail.sendKeys(email);
     }
     
     public void setPassword(String password)
     {
    	 txtpassword.sendKeys(password);
     }
     
     public void clickloginbutton()
     {
    	 btnlogin.click();
     }
     
     
     
	
}
