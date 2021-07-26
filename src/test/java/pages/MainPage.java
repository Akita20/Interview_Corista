package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage(){
    }

    @FindBy(xpath = " //button[@class='navbar-toggle collapsed']")
    public WebElement menuButton;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement usernameInput;
    @FindBy (xpath = "//input[@title='Password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//span[@class='caption']")
    public WebElement next1Button;

    @FindBy (xpath = "//span[@class='web-toolbar__signin-button-label']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[@class='caption']")
    public WebElement signIn2Button;

    @FindBy(xpath = "//h1[@id='home_children_heading']")
    public WebElement verification;

    @FindBy (className = "secondary-button row-button text-button")
    public WebElement createNewAccountButton;

    @FindBy (xpath = "//select[@title='Month']")
    public List<WebElement> monthDropBox;

    @FindBy (xpath = "//select[@title='Day']")
    public List<WebElement> dayDropBox;

    @FindBy (xpath = "//select[@title='Year']")
    public List<WebElement> yearDropBox;

    @FindBy(xpath = "//div[@class='fitting-parent wrapper-centeralign']")
    public WebElement next2Button;

    @FindBy(xpath = "//select[@name='country']")
    public List<WebElement> countries;

    @FindBy(xpath = "//input[@title='Language']")
    public WebElement language;

    @FindBy(xpath = "//input[@title='Email Address']")
    public WebElement emailAddInput;

    @FindBy(xpath = "//input[@title='Password']")
    public WebElement emailPasswordInput;

    @FindBy(xpath = "//input[@id='ember404']")
    public WebElement reEnterPassword;

    @FindBy(xpath = "//a[@id='home_children_button']")
    public WebElement verifyButton;

    @FindBy(xpath = "//input[@name='address-level2']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@title='State or Province']")
    public List<WebElement> selectState;

    @FindBy(xpath = "//input[@title='Postal Code']")
    public WebElement postalInput;


//    public void login() {
//        String username = ConfigurationReader.get("username");
//        String password = ConfigurationReader.get("password");
//
//        usernameInput.sendKeys(username);
//        passwordInput.sendKeys(password);
//        signInButton.click();
//    }

//    public void login(String username, String password) {
//        usernameInput.sendKeys(username);
//        passwordInput.sendKeys(password);
//        signInButton.click();
//    }


}


