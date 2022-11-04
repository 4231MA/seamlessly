package com.seamlessly.step_definitions;

import com.seamlessly.pages.Login_Page;
import io.cucumber.java.en.When;

public class ForgetPassword_StepDefinitions {

    Login_Page loginPage = new Login_Page();

    @When("User clicks on the {string} link")
    public void user_clicks_on_the_link(String forgotPasswordLink) {
        loginPage.forgotPasswordLink.click();
    }

    @When("User can see {string} button on the next page")
    public void user_can_see_button_on_the_next_page(String resetPassword) {
        loginPage.resetPassword.isDisplayed();

    }
}
