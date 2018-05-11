package org.fasttrackit.webviews;

import com.sun.deploy.security.WIExplorerBrowserAuthenticator14;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {

    @FindBy(xpath = "//table[@id='shopping-cart-table']//h2[@class='product-name']")
    private WebElement productName;

    @FindBy(xpath = "//a[@class='cart-link']")
    private WebElement cartLink;

    @FindBy(xpath = "//td[@class=\'product-cart-image\']")
    private WebElement productList;

    @FindBy(xpath = "//div[@class='buttons-set']//button[@title='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@id='shipping-buttons-container']")
    private WebElement continueButtonFromShippingInformationSection;


    @FindBy(xpath = "//button[@title='Proceed to Checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//input[@id='s_method_freeshipping_freeshipping']")
    private WebElement freeShippingOption;


    @FindBy(xpath = "//div[@class='input-box']//div[@id='advice-required-entry-billing:street1']")
    private WebElement requiredAddressField;

    @FindBy(xpath = "//div[@class='input-box']//div[@id='advice-required-entry-billing:city']")
    private WebElement requiredCityField;

    @FindBy(xpath = "//div[@class='input-box']//div[@id='advice-required-entry-billing:postcode']")
    private WebElement requiredZipField;

    @FindBy(xpath = "//div[@class='input-box']//div[@id='advice-required-entry-billing:telephone']")
    private WebElement requiredTelephoneField;

    @FindBy(xpath = "//div[@class='input-box']//div[@id='advice-validate-select-billing:country_id']")
    private WebElement requiredCountryField;

    @FindBy(xpath = "//div[@class='input-box']/div[@id='advice-validate-select-billing:region_id']")
    private WebElement requiredStateField;


    @FindBy(xpath = "//div[@class='input-box']//input[@id='billing:street1']")
    private WebElement addressField;

    @FindBy(xpath = "//div[@class='input-box']//input[@id='billing:city']")
    private WebElement cityField;

    @FindBy(xpath = "//div[@class='input-box']//input[@id='billing:postcode']")
    private WebElement zipField;

    @FindBy(xpath = "//div[@class='input-box']//input[@id='billing:telephone']")
    private WebElement telephoneField;


    @FindBy(xpath = "//div[@class='input-box']/select[@id='billing:region_id']")
    private WebElement stateField;

    @FindBy(xpath = "//div[@class='input-box']/select[@id='billing:country_id']")
    private WebElement countryField;


    @FindBy(xpath = "//button[@id='onepage-guest-register-button']")
    private WebElement continueButtonFromCheckoutMethodSection;

    @FindBy(xpath = "//div[@class='buttons-set']/button[@onclick='billing.save()']")
    private WebElement continueButtonFromBillingInformationSection;


    public WebElement getProceedToCheckoutButton() {
        return proceedToCheckoutButton;
    }

    public WebElement getProductName() {
        return productName;
    }


    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getProductList() {
        return productList;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }


    public WebElement getFreeShippingOption() {
        return freeShippingOption;
    }


    public WebElement getRequiredCityField() {
        return requiredCityField;
    }

    public WebElement getRequiredZipField() {
        return requiredZipField;
    }

    public WebElement getRequiredTelephoneField() {
        return requiredTelephoneField;
    }

    public WebElement getRequiredCountryField() {
        return requiredCountryField;
    }

    public WebElement getRequiredAddressField() {
        return requiredAddressField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getZipField() {
        return zipField;
    }

    public WebElement getTelephoneField() {
        return telephoneField;

    }

    public WebElement getContinueButtonFromShippingInformationSection() {
        return continueButtonFromShippingInformationSection;
    }

    public WebElement getContinueButtonFromCheckoutMethodSection() {
        return continueButtonFromCheckoutMethodSection;
    }

    public WebElement getContinueButtonFromBillingInformationSection() {
        return continueButtonFromBillingInformationSection;
    }

    public Select getStateField() {
        return new Select (stateField);
    }

    public Select getCountryField() {
        return new Select(countryField);
    }


    public WebElement getRequiredStateField() {
        return requiredStateField;}}
