package com.demo.guru99.automation.steps;

import com.demo.guru99.automation.models.Data;
import com.demo.guru99.automation.pageobjects.HomeLoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class HomeLoginStep {

    HomeLoginPage homeLoginPage = new HomeLoginPage();

    @Step
    public void youShouldToSeeYourUserNameInThePortal(Data data){
        Assertions.assertEquals(homeLoginPage.userNamePortal(),
                data.getFirstName());

    }
}
