package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

//homepage
public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {
    }


    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By signInEmailField = By.xpath("//input[@type='text']");
    private By signInPasswordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");
    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("entering");


    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo id displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if Sign in button is Displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if Skip Sign in button is Displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify If Email Field is Displayed");
        return driver.findElement(emailField).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Verify if Sign In Button is Displayed");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click Skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickEmailField(String email) {
        LOG.info("Click EmailField");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton() {
        LOG.info("Click Next Button");
        driver.findElement(nextButton).click();
    }

    public void typeInSignInEmailfield(String email) {
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }


    public void typeInSignInPasswordField(String password) {
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickEnterButton() {
        LOG.info("Click the 'Enter button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessagedisplayed() {
        LOG.info("Verifying if error message is Displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void clickBack() {
        LOG.info("Clicking back in browser");
        driver.navigate().back();
    }

}




