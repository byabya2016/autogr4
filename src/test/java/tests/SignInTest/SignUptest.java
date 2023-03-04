package tests.SignInTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUptest extends BaseTest {

    @Test
    public void signUp(){
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(),"Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(),"Sing in Button is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(),"Skip Sign in Button is not displayed");

    }





}
