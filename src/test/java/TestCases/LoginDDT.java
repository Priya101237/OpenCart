package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import TestBase.BaseClass;
import Utilities.DataProviders;

public class LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData" , dataProviderClass=DataProviders.class)
	
	public void verifyLoginDDT(String email, String Password , String exp)
	
	
	{
		logger.info("Start the LoginDDT application");
		
		try
		{
			
		
		HomePage hp =new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickLogin();
	
		//login page
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(p.getProperty(email));
		lp.setPassword(p.getProperty(Password));
		lp.clickloginbutton();
		
		//MyAccountPage
	    MyAccountPage macc = new MyAccountPage(driver);
	    boolean targetpage=macc.isMyAccountExists();
	    
	    if(exp.equalsIgnoreCase("valid"))
	    {
	    	if(targetpage ==true)
	    	{
	    		macc.clickLogout();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    	
	    	if(exp.equalsIgnoreCase("invalid"))
	    	{
	    		if(targetpage==true)
	    		{
	    			macc.clickLogout();
	    			Assert.assertTrue(false);
	    		}
	    	}
	    	
	    }
		}
	    catch(Exception e)
	    {
	    	Assert.fail();
	    }
	    		
 
	    	
	    	
	    	
	    }
	}


