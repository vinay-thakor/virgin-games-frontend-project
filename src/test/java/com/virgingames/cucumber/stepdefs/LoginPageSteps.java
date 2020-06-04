package com.virgingames.cucumber.stepdefs;

import com.virgingames.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginPageSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }
    @Then("^I should see \"([^\"]*)\" displayed in one of the button$")
    public void iShouldSeeDisplayedInOneOfTheButton(String loginText)  {
        Assert.assertEquals(new HomePage().verifyLoginText(),loginText);
        new HomePage().verifyLoginBtnIsDisplayed();


    }


}
