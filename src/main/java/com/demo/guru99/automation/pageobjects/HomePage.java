package com.demo.guru99.automation.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/")
public class HomePage extends PageObject {
    By userButton = By.xpath("//*[@id='navbar-brand-centered']/ul/li[10]/a");
    public By NewTravelOption = By.xpath("//a[@href='register.php']");

    public void clickUserButton(){
        getDriver().findElement(userButton).click();
        }

    public void clickNewTravelOption(){
        getDriver().findElement(NewTravelOption).click();
    }
}
