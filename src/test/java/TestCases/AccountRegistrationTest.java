package TestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.AccountRegisterationPage;
import PageObject.HomePage;
import TestBase.BaseClass;

public class AccountRegistrationTest extends BaseClass{
	
	//WebDriver driver;
	
	@Test(groups= {"regression","master"})
	public void verifyAccountRegistrationTest()
	{
		logger.info("***** Start AccountRegistrationTest *****");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.ClickRegister();
		logger.info("Clicked on Registration Link");
		
		AccountRegisterationPage regpage =new AccountRegisterationPage(driver);
		
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		
		String password=randomAlphaNumeric();
		regpage.setpassword(password);
		regpage.clickcheckbox();
		regpage.clickcontinuebutton();
		}
		
		catch(Exception e)
		{
			logger.error("Test failed");
			Assert.fail();
		}
		
		logger.info("***** Finished Account Registration******");
		
	
	}	
	
	
}
