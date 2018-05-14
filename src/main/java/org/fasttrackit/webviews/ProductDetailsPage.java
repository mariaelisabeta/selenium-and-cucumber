package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {
    @FindBy(linkText = "VIEW DETAILS")
    private WebElement viewDetailsButton;

    @FindBy(xpath = "//ul[@class='toggle-tabs']/li/span[text() = 'Additional Information']")
    private WebElement additionalInformationTab;

    @FindBy(className = "data last")
    private WebElement booksType;

    @FindBy(xpath = "//tr[@class='last even']/th[@class='label']")
    private WebElement booksAndMusicTypeLabel;

    @FindBy(xpath = "//tr[@class='even']/th[@class='label']")
    private WebElement typeLabel;

    @FindBy(xpath = "//dt[@class='swatch-attr']/label[@id='color_label']")
    private WebElement colorLabel;

    @FindBy(xpath = "//dt[@class='swatch-attr']/label[@id='size_label']")
    private WebElement sizeLabel;

    @FindBy(xpath = "//dd[contains(@class,'swatch-attr') and preceding-sibling::dt[contains(@class,'swatch-attr') and child::label[@id='color_label']]][1]//div[@class='validation-advice']")
    private WebElement requiredColorField;

    @FindBy(xpath = "//dd[contains(@class,'swatch-attr') and preceding-sibling::dt[contains(@class,'swatch-attr') and child::label[@id='color_label']]][2]//div[@class='validation-advice']")
    private WebElement requiredSizeField;

    @FindBy(xpath = "//div[@class='add-to-cart-buttons']//button[@class='button btn-cart']")
    private WebElement addToCartButton;

    @FindBy(name = "indigo")
    private WebElement indigoColor;

    @FindBy(name = "m")
    private WebElement mSize;





    public WebElement getMSize() {
        return mSize;
    }

    public WebElement getIndigoColor() {
        return indigoColor;
    }

    public WebElement getViewDetailsButton() {
        return viewDetailsButton;
    }

    public WebElement getAdditionalInformationTab() {
        return additionalInformationTab;
    }

    public WebElement getBooksType() {
        return booksType;
    }

    public WebElement getBooksAndMusicTypeLabel() {
        return booksAndMusicTypeLabel;
    }

    public WebElement getTypeLabel() {
        return typeLabel;
    }

    public WebElement getColorLabel() {
        return colorLabel;
    }

    public WebElement getSizeLabel() {
        return sizeLabel;
    }

    public WebElement getRequiredColorField() {
        return requiredColorField;
    }

    public WebElement getRequiredSizeField() {
        return requiredSizeField;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

}
