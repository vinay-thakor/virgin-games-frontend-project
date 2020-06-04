package com.virgingames.pages;

import com.cucumber.listener.Reporter;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _loginText;


    public String verifyLoginText() {
        Reporter.addStepLog("Clicking on login button" + _loginText.toString());
        log.info("Clicking on login button" + _loginText.toString());
        return getTextFromElement(_loginText);
    }

    public Boolean verifyLoginBtnIsDisplayed() {
        Reporter.addStepLog("Login Button is Displayed " + _loginText.toString());
        log.info("Login Button is Displayed " + _loginText.toString());
        return _loginText.isDisplayed();
    }
}