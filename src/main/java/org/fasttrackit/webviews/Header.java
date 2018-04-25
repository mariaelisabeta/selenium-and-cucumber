package org.fasttrackit.webviews;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header {

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(id = "select-language")
    private WebElement languageDropDownList;

    @FindBy (linkText = "ACCOUNT")
    private WebElement accountButton;

    @FindBy (linkText = "Log In")
    private WebElement loginSection;



   public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getLanguageDropDownList() {return languageDropDownList;}

    public WebElement getAccountButton() {return accountButton;}



    public void search(String keyword) {
        searchField.sendKeys(keyword + Keys.ENTER);
        System.out.println("Pressed Enter in search field.");
    }

    }


