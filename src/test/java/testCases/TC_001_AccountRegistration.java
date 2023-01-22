package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccoutRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;



public class TC_001_AccountRegistration extends BaseClass {

	
	
	@Test(groups= {"Regression","Master"})
	void test_account_Registration() throws InterruptedException {
		logger.debug("application loggs   ");
		logger.info("*** Starting TC_001_AccountRegistration***");
		try {
		HomePage hp= new HomePage(driver);
		hp.clickonmyaccount();
		logger.info("click my acct");
		hp.clickonregister();
		logger.info("click my acct registraion");
		
		AccoutRegistrationPage ar= new AccoutRegistrationPage( driver);
		logger.info("providing customer data ");
		  ar.setFirstName(randomeString().toUpperCase());
		  ar.setLastName(randomeString().toUpperCase());
		  ar.setEmail(randomeString()+"@gmail.com");
		// ar.setTelephone(randomeNumber());
		  String Passward =randomAlphaNumeric();
		  
		  ar.setPassword(Passward);
		// ar.setConfirmPassword(Passward);
		  
		  
		  
		  ar.setPrivacyPolicy();
		  ar.clickContinue();
			logger.info("click continiu");
	 String confg= 	  ar.getConfirmationMsg();
		logger.info("validating the data");
		    Assert.assertEquals(confg, "Your Account Has been Created! ");
	}

	catch( Exception e) {
	logger.error("test failed");
	
	
	}
		logger.info("finish log test");
}
}