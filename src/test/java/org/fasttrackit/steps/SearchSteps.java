package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertThat;

public class SearchSteps extends TestBase {
    private Header header = initElements(Header.class);

    @And("^I search a product by \"([^\"]*)\"$")
    public void iSearchAProductBy(String keyword) {
        header.search(keyword);
    }


    @Then("^The \"([^\"]*)\" page is displayed$")
    public void thePageIsDisplayed(String keyword) {
        WebElement pageTitle = driver.findElement(By.cssSelector(".page-title h1"));

    }

    @Then("^I receive \"([^\"]*)\" message under page title$")
    public void iReceiveMessageUnderPageTitle(String keyword) {
        WebElement messageUnderPageTitle = driver.findElement(By.cssSelector("p.note-msg "));
    }
}











