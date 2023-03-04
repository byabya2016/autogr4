package tests.SignInTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {


    @Test
    public void checkIfLogoIsDisplayed(){
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

    }



}

