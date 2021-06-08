package com.demo.guru99.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeRegisterPage extends PageObject {

    // Contact information
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phoneNumber = By.name("phone");
    By email = By.name("userName");

    // Mailing Information
    By address = By.name("address1");
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By dropDrownList = By.name("country");
    By dropDrownList2 = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[247]");

    // User information -----------------
    By userName = By.name("email");
    By password = By.name("password");
    By confirmPassword = By.name("confirmPassword");
    //--------------------------------------
    By clickSubmit = By.name("submit");

    public void setFirstName(String firstuser){
        getDriver().findElement(firstName).sendKeys(firstuser);
    }
    public void setLastName(String lastuser){
        getDriver().findElement(lastName).sendKeys(lastuser);{
        }
    }
    public void setPhoneNumber(String phoneUser){
        getDriver().findElement(phoneNumber).sendKeys(phoneUser);
    }
    public void setEmail(String emailUser){
        getDriver().findElement(email).sendKeys(emailUser);
    }
    // Mailing information ---------------------------------

    public void setAddress(String addressUser){
        getDriver().findElement(address).sendKeys(addressUser);
    }
    public void setCity(String cityUser){
        getDriver().findElement(city).sendKeys(cityUser);
    }
    public void setState(String stateUser){
        getDriver().findElement(state).sendKeys(stateUser);
    }
    public void setPostalCode(String postalCodeUser){
        getDriver().findElement(postalCode).sendKeys(postalCodeUser);
    }
    public void setDropDrownList(){
        getDriver().findElement(dropDrownList).click();
    }
    public void setDropDrownList2(){
        getDriver().findElement(dropDrownList2).click();
    }
    public void setUserName(String userNameUser){
        getDriver().findElement(userName).sendKeys(userNameUser);
    }
    public void setPassword(String passwordUser){
        getDriver().findElement(password).sendKeys(passwordUser);
    }
    public void setConfirmPassword(String confirmPasswordUser){
        getDriver().findElement(confirmPassword).sendKeys(confirmPasswordUser);
    }
    public void setClickSubmit(){
        getDriver().findElement(clickSubmit).click();
    }
}
