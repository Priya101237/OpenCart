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
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import TestBase.BaseClass;

public class LoginTest extends BaseClass{
	

	@Test(groups= {"sanity","master"})
	public void verifymyaccountpage() {
		
		logger.info("****Starting myaccountpage testcase***");
	
		try {
		
		//homepage
		HomePage hp =new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("clicked on myaccount page ");
		hp.ClickLogin();
		logger.info("clicked on login page under myaccount ");
		
		//login page
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickloginbutton();
		
		//MyAccountPage
	    MyAccountPage macc = new MyAccountPage(driver);
	    boolean targetpage=macc.isMyAccountExists();
	    
	    if(targetpage==true) {
	    	logger.info("login test passed");
	    	Assert.assertTrue(true);
	    }
	    else
	    {  
	        logger.info("login test failed");
	    	Assert.fail();
	    }
		}catch(Exception e)
		{
			logger.info("***finished login test ***");
		}
	    
		
		
		
	}

	
	
}
