package com.cydeo.trycloud24.pages;

import com.cydeo.trycloud24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//input[@id='user']")
        public WebElement inputUser;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement inputPassword;

        @FindBy(xpath = "//input[@id='submit-form']")
        public WebElement logInBtn;


        public void loginToPage(String login, String pass) {

            inputUser.sendKeys(login);
            inputPassword.sendKeys(pass);
            logInBtn.click();
        }
    }

