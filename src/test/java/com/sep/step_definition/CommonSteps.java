package com.sep.step_definition;

import com.sep.pages.StartApplicationPage;
import io.cucumber.java.en.Given;

public class CommonSteps {

    private StartApplicationPage startApplicationPage = new StartApplicationPage();

    @Given("the user is on the enrollment page {string}")
    public void the_user_is_on_the_enrollment_page(String string) {
        startApplicationPage.logIn(string);

    }

}
