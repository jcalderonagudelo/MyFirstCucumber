package com.demo.guru99.automation.stepdefinitions;


import com.demo.guru99.automation.models.Data;
import com.demo.guru99.automation.pageobjects.HomeLoginPage;
import com.demo.guru99.automation.steps.HomeLoginStep;
import com.demo.guru99.automation.steps.HomeRegisterStep;
import com.demo.guru99.automation.steps.HomeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    HomeRegisterStep homeRegisterStep;
    @Steps
    HomeLoginPage homeLoginPage;
    HomeLoginStep homeLoginStep;


    @Given("^enter the page to register$")
    public void enterThePageToRegister() throws InterruptedException {
        homeStep.openBrowser();
        Thread.sleep(2000);
        homeStep.selectNewTravel();
        Thread.sleep(2000);
    }
    @When("^full all the formulary$")
    public void directTheForm(List<Data> dataList) throws InterruptedException{
        homeRegisterStep.registerUser(dataList.get(0));
        Thread.sleep(2000);

  }
    @Then("^you should to see your username in the portal$")
    public void youShouldToSeeYourUserNameInThePortal(List<Data> dataList ) throws  InterruptedException {
        System.out.println("Exitoso");
        System.out.println(homeLoginPage.userNamePortal());
        homeLoginStep.youShouldToSeeYourUserNameInThePortal(dataList.get(0));
        Thread.sleep(2000);

    }


}

