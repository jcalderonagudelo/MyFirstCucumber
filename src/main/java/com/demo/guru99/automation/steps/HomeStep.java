package com.demo.guru99.automation.steps;

import com.demo.guru99.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }
    @Step
    public void selectNewTravel(){
        homePage.clickUserButton();
        homePage.clickNewTravelOption();
    }
}

