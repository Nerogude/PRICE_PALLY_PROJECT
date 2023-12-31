package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.GoogleAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_013_LoginWithFacebook extends BaseClass{
	
	
	@Test
	public void VerifyLoginWithFacebook() throws InterruptedException {
		
		logger.info("***Starting VerifyLoginWithFaceebook Test***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("*** login details intentionally kept blank***");
		LoginPage lp = new LoginPage(driver);
		lp.clickFacebookSignUpBtn();
		
		
		
		
		logger.info("***Assert test***");
		Assert.assertTrue(lp.appleSignUpBtnIsDisplayed());
		
	}
	
	
	

}
