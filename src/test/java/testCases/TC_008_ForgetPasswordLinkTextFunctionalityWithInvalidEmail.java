package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgetPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_008_ForgetPasswordLinkTextFunctionalityWithInvalidEmail extends BaseClass{
	
	
	@Test
	public void ForgetPasswordLinkTextFunctionalityWithInvalidEmail() throws InterruptedException {
		
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
		lp.clickForgotPasswordLink();
		//Thread.sleep(3000);
		
		ForgetPasswordPage forgotpassword = new ForgetPasswordPage(driver);
		forgotpassword.setEmailField(getRandomString()+"@mail.com");
		forgotpassword.clickResetLinkBtn();
		
		
		
		
		logger.info("***Assert test***");
		
		Assert.assertEquals(lp.getSignIntoYourAccountText(), "Sign in to your account"); 
		
	}
	
	
	

}
