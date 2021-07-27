package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import utilis.BrowserUtils;
import utilis.ConfigurationReader;
import utilis.Driver;

import java.util.List;

public class mainPage_stepDef {

    MainPage mainPage = new MainPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page()  {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("user click the menuButton;")
    public void user_Click_The_MenuButton() {

        mainPage.menuButton.click();
    }


    @When("user should see the page title is Qualities")
    public void user_should_see_the_page_title_is_qualities() {

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Independent Software Testing Company | Quality Assurance Services | Qualitest";
        System.out.println("title = " + actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
        // Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("user should see following links")
    public void user_should_see_following_links(List<String> expectedNavigations) {
 System.out.println("navigations = " + expectedNavigations);
        for (WebElement eachLink : mainPage.navigations) {
            System.out.println("eachLink = " + eachLink.getText());
        }
       //  Create a list of string (as place holder)
        List<String> actualList = BrowserUtils.getElementsText((mainPage.navigations));
        // loop through
//        for (String each: expectedNavigations) {
//            actualList += expectedNavigations.add(each,n);
        Assert.assertEquals(false, actualList.equals(expectedNavigations));

    }
    }
