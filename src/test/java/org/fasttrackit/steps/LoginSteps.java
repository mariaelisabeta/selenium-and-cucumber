package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Sr_cyrl;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.LoginPage;
import org.fasttrackit.webviews.ProductDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class LoginSteps extends TestBase {

    private LoginPage loginPage = initElements(LoginPage.class);
    private Header header = initElements(Header.class);
    private ProductDetailsPage productDetailsPage= initElements(ProductDetailsPage.class);


    @Given("^I open the homepage and I enter the Login section$")
    public void iOpenTheHomepageAndIEnterTheLoginSection() {
        header.getAccountButton().click();
        driver.findElement(By.linkText("Log In")).click();
    }

    @And("^I enter \"([^\"]*)\" in the email address field and \"([^\"]*)\" in the password field$")
    public void iEnterInTheEmailaddressFieldAndInThePasswordField(String email, String password) {

        loginPage.getEmailAddressField().sendKeys(email);
        loginPage.getPasswordField().sendKeys(password);

    }




    @When("^I click the LOGIN button$")
    public void iClickTheButton() {
        loginPage.getLoginButton().click();


    }

    @Then("^I receive \"([^\"]*)\" message$")
    public void iReceiveMessage(String message) {
        assertThat("Unexepected error message received",
                getErrorMessageContainer().getText(),
                containsString(message));
    }


    @Then("^I receive \"([^\"]*)\" message under the password field$")
    public void iReceiveMessageUnderThePasswordField(String messageUnderThePasswordField) {
        assertThat("Unexpected error message received",
                getErrorMessageUnderThePasswordField().getText(),
                containsString(messageUnderThePasswordField));
    }


    @Then("^I receive \"([^\"]*)\" message under the email address field$")
    public void iReceiveMessageUnderTheEmailAddressField(String messageUnderTheEmailAdressField) {
        assertThat("Unexpected error message received",
                getErrorMessageUnderTheEmailAddressField().getText(),
                containsString(messageUnderTheEmailAdressField));
    }



}




