package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.SignInPage.SignInPage;

public class BaseTest {
    private SignInPage SingInPage;
    public SignInPage signInPage = SingInPage.getInstance();


    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){

        BasePage.tearDown();
    }




}

