package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Register.html";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void register() {
        driver.get(newUrl);
        String firstName="Bianca";
        String lastName="Veliscu";
        String adress="Cluj, str.Primaverii, Nr 407 J";
        String email="c_veliscu@yahoo.com";
        String language = "Romanian";
        String skills = "Java";
        String phone = "0789909090";

        LOG.info("Check title");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Check formTitle");
        Assert.assertTrue(registerPage.isFormTitle(), "formTitle is not displayed");


        LOG.info("Check Address");
        Assert.assertTrue(registerPage.isAddressDisplayed(), "Address is not displayed");

        LOG.info("Check EmailAddress");
        Assert.assertTrue(registerPage.isEmailAddressDisplayed(), "EmailAddress is not displayed");

        LOG.info("Type in Full Name");
        registerPage.typeInFirstName(firstName);
        registerPage.typeInLastName(lastName);

        LOG.info("Type in Address");
        registerPage.typeInAdress(adress);

        LOG.info("Type in Address");
        registerPage.typeInEmailAddress(email);

        LOG.info("Select Gender");
        registerPage.setMaleGender();

        LOG.info("Select Gender");
        registerPage.setFemaleGender();

        LOG.info("Select Hobby Check Mark");
        registerPage.SetCricketCheckMark();
        registerPage.SetMoviesCheckMark();
        registerPage.SetHockeyCheckMark();


        LOG.info("Select a Language");
        registerPage.selectLanguage(language);

        LOG.info("Select Skills");
        registerPage.selectSkills(skills);

        LOG.info("Type in phone number");
        registerPage.typeInPhonenumber(phone);

        LOG.info("Check the PasswordField");
        Assert.assertTrue(registerPage.isPasswordFieldDisplayed(),"Password Field is not displayed");

        LOG.info("Check the ConfirmPasswordField");
        Assert.assertTrue(registerPage.isConfirmPasswordFieldDisplayed(),"ConfirmPasswordField is not displayed");

        LOG.info("Check the Submit Button");
        Assert.assertTrue(registerPage.isSubmitButtonDisplayed(),"SubmitButton is not displayed");

        LOG.info("Check the Refresh Button");
        Assert.assertTrue(registerPage.isRefreshButtonDisplayed(),"Refresh is not displayed");








    }





}
