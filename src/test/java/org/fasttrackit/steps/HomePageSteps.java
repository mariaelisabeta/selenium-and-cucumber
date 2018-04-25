package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.LoginPage;
import org.openqa.selenium.By;

public class HomePageSteps extends TestBase {


    private Header header = initElements(Header.class);
    @Given("^I open the homepage$")
    public void iOpenTheHomepage() {
        header.getAccountButton().click();
        driver.findElement(By.linkText("Log In")).click();
    }


}
