package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPages;
import testBase.BaseClass;

public class TC_002_LoginTest  extends BaseClass{

	
	@Test(groups= {"sanity","Master"})
	public void test_Login() {
		
		try {
		logger.info("****Startng Tc 002 **");
		HomePage hp= new HomePage(driver);
		hp.clickonmyaccount();
		hp.clickonLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("mailidl"));
		lp.setPassword(rb.getString("pass"));
		lp.clickLogin();
		
		MyAccountPages macc= new MyAccountPages(driver);
	  boolean targetpage =	macc.isMyAccountPageExists();
	  Assert.assertEquals(targetpage,true);
		}
		catch(Exception e) {
		
		}
		logger.info("****Test FINISHED***");
	}
	
}
