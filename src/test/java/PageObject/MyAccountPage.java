package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
    WebDriver driver;
     public MyAccountPage(WebDriver driver)
     {
    	 super(driver);
     }
     
     @FindBy(xpath="//h2[normalize-space()='My Account']")
     WebElement msgheadingMyAccount;
     
     @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
     WebElement logout;
     
     public boolean isMyAccountExists()
     {
    	 try {
    		 
    		 return (msgheadingMyAccount.isDisplayed());
    		 
    	 } catch(Exception e) {
    		 return (false);
    		 
    	 }
     } 	 
    public void clickLogout() {
    		 
    		 logout.click();
    		 
    	 }
     }
     
     
  
     
     
	

