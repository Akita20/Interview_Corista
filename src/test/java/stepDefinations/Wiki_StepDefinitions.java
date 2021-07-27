package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.WikiPage;
import utilis.ConfigurationReader;
import utilis.Driver;

public class Wiki_StepDefinitions {
    WikiPage wikiPage = new WikiPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.get("wikiUrl");
        Driver.get().get(url);

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = string +" - Wikipedia";

        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
    }


    @Then("User sees {string} in the main header")
    public void userSeesInTheMainHeader(String arg0) {

        String actualHeaderText = wikiPage.mainHeader.getText();
        String expectedHeaderText= arg0;

        //Checking the context of the web element
        Assert.assertTrue(actualHeaderText.equalsIgnoreCase(expectedHeaderText));

        //Checking if the web element displayed or not
        Assert.assertTrue(wikiPage.mainHeader.isDisplayed());



    }


}
