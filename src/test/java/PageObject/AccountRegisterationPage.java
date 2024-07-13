package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterationPage extends BasePage {
	
	WebDriver driver;
	 public  AccountRegisterationPage(WebDriver driver)
	 {
		 super(driver);
	 }
	 
	 @FindBy(xpath="input-firstname")
	 WebElement txtFirstName;
	 
	 @FindBy(xpath="input-lastname")
	 WebElement txtLastName;
	 
	 @FindBy(xpath="input-email")
	 WebElement txtEmail;
	 
	 @FindBy(xpath="input-password")
	 WebElement txtpassword;
	 
	 @FindBy(xpath="//*[@name='agree']")
	 WebElement clkcheckbox;
	 
	 @FindBy(xpath="//*[@type='submit']")
	 WebElement btncontinue;
	 
	 public void setFirstName(String fname) {
		 txtFirstName.sendKeys(fname);
	 }
	 
	 public void setLastName(String lname) {
		 txtLastName.sendKeys(lname);
	 }
	 
	 public void setEmail(String email) {
		 txtEmail.sendKeys(email);
	 }
	 
	 public void setpassword(String psww) {
		 txtpassword.sendKeys(psww);
	 }
	 
	 public void clickcheckbox() {
		 clkcheckbox.click();
	 }
	 
	 public void clickcontinuebutton() {
		 btncontinue.click();
	 }

	
	 
	 
     
	 
}
