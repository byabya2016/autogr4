package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;


    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By formTitle = By.xpath("//div[h2='Register']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAddress = By.xpath("//input[@type='email']");
    private By inputFirstname = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastname = By.xpath("//input[@ng-model='LastName']");
    private By MaleGender = By.xpath("//input[@value='Male']");
    private By FeMaleGender = By.xpath("//input[@value='FeMale']");
    private By inputPhone = By.xpath("//input[@type='tel']");
    private By criketCheckMark = By.id("checkbox1");
    private By moviesCheckMark = By.id("checkbox2");
    private By hockeyCheckMark = By.id("checkbox3");
    private By languageField = By.id("msdd");
    private By skillsField = By.id("Skills");
    private By Countries = By.id("countries");
    private By SelectCountry = By.xpath("//span[@role=");
    private By Year = By.id("yearbox");
    private By Month = By.xpath("//select[@ng-model='monthbox']");
    private By Day = By.id("Daybox");
    private By Password = By.id("firstpassword");
    private By Confirmpassword = By.id("secondpassword");
    private By Submit = By.id("submitbtn");
    private By Refresh = By.id("Button1");

    String selectLanguage = "//a[contains(text(), '%s')]";
    String country = "//span[contains(text(), '%s')]";


    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();

        }
        return instance;
    }

    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displeyed");
        return driver.findElement(title).isDisplayed();
    }

    public boolean isFormTitle() {
        LOG.info("Verify if FormTitle is displayed");
        return driver.findElement(formTitle).isDisplayed();
    }

    public boolean isAddressDisplayed() { // este displayed dar trebuie si public void sa completeze adresa cu sendkey
        LOG.info("Verify is Address is displayed");
        return driver.findElement(inputAddress).isDisplayed();

    }

    public void typeInAdress(String address) {
        LOG.info("Type in Address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public boolean isEmailAddressDisplayed() {// metode care returneaza true or false
        LOG.info("Verify is EmailAddrees is displayed");
        return driver.findElement(inputEmailAddress).isDisplayed();
    }

    public void typeInEmailAddress(String emailAddress) {
        driver.findElement(inputEmailAddress).sendKeys(emailAddress);

    }

    public void typeInFirstName(String fName) {
        LOG.info("Type in FirstName");
        driver.findElement(inputFirstname).sendKeys(fName);
    }

    public void typeInLastName(String lName) {
        LOG.info("Type in LastName");
        driver.findElement(inputLastname).sendKeys(lName);

    }

    public void setMaleGender() {
        LOG.info("Click the Male radio button");
        driver.findElement(MaleGender).click();
    }


    public void setFemaleGender() {
        LOG.info("Click in FeMale radio button");
        driver.findElement(FeMaleGender).click();
    }


    public void SetCricketCheckMark(){
        LOG.info("Click The Cricket radio button");
        driver.findElement(criketCheckMark).click();
    }


    public void SetMoviesCheckMark() {
        LOG.info("Click The Movies radio button");
        driver.findElement(moviesCheckMark).click();
    }

    public void SetHockeyCheckMark() {
        LOG.info("Click The Hockey radio button");
        driver.findElement(hockeyCheckMark).click();
    }

    public void selectLanguage(String language){
        LOG.info("Select language");
        driver.findElement(languageField).click();
        driver.findElements(By.xpath(String.format(selectLanguage,language)));
    }


    public void selectSkills(String skills){
        LOG.info("Select Skills");
        Select newSkill= new Select(driver.findElement(skillsField));
        newSkill.selectByValue(skills);
    }

    public boolean isCountriesDropdownDisplayed(){
        LOG.info("Verify if Country Dropdown is  Displayed");
        return driver.findElement(Countries).isDisplayed();
    }

    public boolean isYearDropDownDisplayed(){
        LOG.info("Verify if Country DropDown is Displayed");
        return driver.findElement(Year).isDisplayed();

    }

    public boolean isMonthDropDownDisplayed(){
        LOG.info("Verify if Month DropDown is Displayed");
        return driver.findElement(Month).isDisplayed();
    }

    public boolean isDayDropDownDisplayed(){
        LOG.info("Verify if Day DropDown is Displayed");
        return driver.findElement(Day).isDisplayed();
    }

   public boolean isPasswordFieldDisplayed(){
        LOG.info("Verify if Password Field is Displayed");
        return driver.findElement(Password).isDisplayed();

   }

   public boolean isConfirmPasswordFieldDisplayed(){
        LOG.info("Verify if Confirm Password Field is Displayed");
        return driver.findElement(Confirmpassword).isDisplayed();

   }

  public boolean isSubmitButtonDisplayed(){
        LOG.info("Verify if Submit button is displayed");
        return driver.findElement(Submit).isDisplayed();

  }

  public boolean isRefreshButtonDisplayed(){
        LOG.info("Verify if Refresh button is displayed");
        return driver.findElement(Refresh).isDisplayed();

    }


    public void typeInPhonenumber(String phone) {
        LOG.info("Type in Phone number");
        driver.findElements(inputPhone);

    }







}



    
    

