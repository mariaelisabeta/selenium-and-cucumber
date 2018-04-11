package org.fasttrackit.webviews;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="email")
    private WebElement emailAddressField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;


    public WebElement getEmailAddressField() {return emailAddressField;}

    public WebElement getPasswordField() {return passwordField;}

    public WebElement getLoginButton() {return loginButton;}




}