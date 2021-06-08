package com.demo.guru99.automation.steps;


import com.demo.guru99.automation.models.Data;
import com.demo.guru99.automation.pageobjects.HomeRegisterPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeRegisterStep {

   HomeRegisterPage homeRegisterPage = new HomeRegisterPage();

    @Step
    public void registerUser(Data data){
        // Contact information -------------------------
        homeRegisterPage.setFirstName(data.getFirstName());
        homeRegisterPage.setLastName(data.getLastName());
        homeRegisterPage.setPhoneNumber(data.getPhoneNumber());
        homeRegisterPage.setEmail(data.getEmail());
        // Mailing Information --------------------------
        homeRegisterPage.setAddress(data.getAddress());
        homeRegisterPage.setCity(data.getCity());
        homeRegisterPage.setState(data.getState());
        homeRegisterPage.setPostalCode(data.getPostalCode());

        homeRegisterPage.setDropDrownList();
        homeRegisterPage.setDropDrownList2();
        // User information ------------------------------
        homeRegisterPage.setUserName(data.getUserName());
        homeRegisterPage.setPassword(data.getPassword());
        homeRegisterPage.setConfirmPassword(data.getConfirmPassword());
        homeRegisterPage.setClickSubmit();
    }

}
