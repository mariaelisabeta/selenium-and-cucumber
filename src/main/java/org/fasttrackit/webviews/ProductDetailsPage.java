package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {
    @FindBy(linkText = "VIEW DETAILS")
    private WebElement viewDetailsButton;

    @FindBy (xpath= "//ul[@class='toggle-tabs']/li/span[text() = 'Additional Information']")
    private WebElement additionalInformationTab;

    @FindBy (className = "data last")
    private WebElement booksType;

    @FindBy (xpath = "//tr[@class='last even']/th[@class='label']")
    private WebElement booksAndMusicTypeLabel;

    @FindBy (xpath = "//tr[@class='even']/th[@class='label']")
    private WebElement typeLabel;

    public WebElement getViewDetailsButton() {return viewDetailsButton;}

    public WebElement getAdditionalInformationTab() {return additionalInformationTab;}

    public WebElement getBooksType() {return booksType;}

    public WebElement getBooksAndMusicTypeLabel() {return booksAndMusicTypeLabel;}

    public WebElement getTypeLabel() { return typeLabel;}



}
