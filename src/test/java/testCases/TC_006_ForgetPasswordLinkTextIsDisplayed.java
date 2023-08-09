package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_006_ForgetPasswordLinkTextIsDisplayed extends BaseClass{
	
	
	@Test
	public void ForgetPasswordLinkTextIsDisplayed() throws InterruptedException {
		
		logger.info("***Starting ForgetPasswordLinkTextIsDisplayed Test***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("***Enter valid login details***");
		LoginPage lp = new LoginPage(driver);
		lp.setEmailOrUsernameField(resourcebundle.getString("email"));
		//lp.setPasswordField(resourcebundle.getString("password"));
		//lp.clickLoginBtn();
		
		logger.info("***Assert test***");
		
		Assert.assertTrue(lp.forgetPasswordLinkTextIsDisplayed()); 
		
	}
	
	
	

}
