package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage(){
    }

    @FindBy(xpath = "//div[@class='mobile-nav-icon']")
    public WebElement menuButton;

    @FindBy(id = "updated_nav")
    public WebElement mainPageHeader;

    @FindBy(xpath = "//div[@class='mobile-navigation open']")
    public List<WebElement> navigations;

    @FindBy(xpath = " //li[@id='menu-item-1369']/a")
    public WebElement industries;

    @FindBy(xpath = " //li[@id='menu-item-1901']/a")
    public WebElement howWeEngage;

    @FindBy(xpath = " //li[@id='menu-item-6702']/a")
    public WebElement products;

    @FindBy(xpath = " //li[@id='menu-item-16236']/a")
    public WebElement partners;

    @FindBy(xpath = "//li[@id='menu-item-1393']/a")
    public WebElement about;

    @FindBy(xpath = " //li[@id='menu-item-1385']/a")
    public WebElement Insights;

    @FindBy(xpath = " //li[@id='menu-item-1403']/a")
    public WebElement contactUs;


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


