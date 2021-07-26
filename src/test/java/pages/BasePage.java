package pages;

import org.openqa.selenium.support.PageFactory;
import utilis.Driver;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
//    public void navigateTo(String tab) {
//        String xpath = String.format("//a[.='%s']", tab);
//        BrowserUtils.clickElement(xpath);
//    }


}
