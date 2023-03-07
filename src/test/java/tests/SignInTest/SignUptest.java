package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


class SignUpTest extends BaseTest {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";


    @Test
    public void signUp() {
        String email = "Email@example.com";
        String password = "12345";

        LOG.info("Navigate to Sign Up Page");
        driver.get(newUrl);
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sing in Button is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign in Button is not displayed");
        signInPage.clickSignInButton();

        LOG.info("Type in email and pass");
        signInPage.typeInSignInEmailfield(email);
        signInPage.typeInSignInPasswordField(password);

       LOG.info("Click Enter button");
       signInPage.clickEnterButton();

        LOG.info("Verifying if error message is displayed");
        Assert.assertTrue(signInPage.isErrorMessagedisplayed(),"Error message is not displayed");
    }

}
