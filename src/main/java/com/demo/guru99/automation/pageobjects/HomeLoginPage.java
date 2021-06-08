package com.demo.guru99.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeLoginPage extends PageObject {

    public By userLogin = By.xpath("//font[@face='Arial, Helvetica, sans-serif']/b"); /* By.xpath("//font[text()='Note']");*/

    public String userNamePortal(){
        return getDriver().findElement(userLogin).getText();
    }
}
