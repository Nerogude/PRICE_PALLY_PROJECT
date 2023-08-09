package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_005_LoginFunctionalityWithoutCredentials extends BaseClass{
	
	
	@Test
	public void LoginTestWithValidCredentials() throws InterruptedException {
		
		logger.info("***Starting LoginTestWithValidCredentials***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("*** login details intentionally kept blank***");
		LoginPage lp = new LoginPage(driver);
		//lp.setEmailOrUsernameField(" ");
		//lp.setPasswordField(" ");
		lp.clickLoginBtn();
		
		logger.info("***Assert test***");
		Assert.assertEquals(lp.getEmailRequiredText(), "Email is required"); 
		Assert.assertEquals(lp.getPasswordRequiredText(), "Password is required"); 
		
	}
	
	
	

}
