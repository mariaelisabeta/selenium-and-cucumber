package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    @FindBy(css =".page-title h1")
    private WebElement dashboardTitle;

    public WebElement getDashboardTitle() { return dashboardTitle; }




}
