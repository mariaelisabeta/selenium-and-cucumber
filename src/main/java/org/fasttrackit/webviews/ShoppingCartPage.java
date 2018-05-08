package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

    @FindBy(xpath = "//table[@id='shopping-cart-table']//h2[@class='product-name']")
    private WebElement productName;

    public WebElement getProductName() {
        return productName;
    }


    public WebElement getCartLink() {
        return cartLink;
    }

    @FindBy (xpath= "//a[@class='cart-link']")
    private WebElement cartLink;



}
