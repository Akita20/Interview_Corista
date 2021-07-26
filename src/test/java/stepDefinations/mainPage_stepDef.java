package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import utilis.BrowserUtils;
import utilis.ConfigurationReader;
import utilis.Driver;

public class mainPage_stepDef {

    MainPage loginPage = new MainPage();

    @Given("user open the main page")
    public void userOpenTheMainPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Then("user able to see login button and can click")
    public void userAbleToSeeLoginButtonAndCanClick() {
        loginPage.signInButton.click();
    }

    @Given("user in the login page")
    public void user_open_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        loginPage.signInButton.click();
    }

    @When("user enter the valid username and click the next button")
    public void userEnterTheValidUsername() {
        String username = ConfigurationReader.get("username");
        loginPage.usernameInput.sendKeys(username);
        BrowserUtils.waitFor(2);
        loginPage.next1Button.click();


    }

    @And("user enter the valid password and click the next button")
    public void userEnterTheValidPasswordAndClickTheNextButton() {
        String password = ConfigurationReader.get("password");

        loginPage.passwordInput.sendKeys(password);
        BrowserUtils.waitFor(2);
        loginPage.signIn2Button.click();
    }


    @Then("user can see the expected title")
    public void userCanSeeTheDashboard() {

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Sign In | Sony";
        System.out.println("title = " + actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user click the what we do")
    public void user_Click_The_WhatWeDo() {

    }

    @Then("user should see the page title")
    public void userShouldSeeThePageTitle() {
    }
}
