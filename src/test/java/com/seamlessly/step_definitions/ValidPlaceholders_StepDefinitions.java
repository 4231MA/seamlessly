package com.seamlessly.step_definitions;

import com.seamlessly.pages.Login_Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ValidPlaceholders_StepDefinitions {

    Login_Page loginPage = new Login_Page();

    @Then("Verify that user can see valid placeholders on the related input boxes")
    public void verify_that_user_can_see_valid_placeholders_on_the_related_input_boxes() {

        String expUsername = "Username or email";
        String actUsername = loginPage.userName.getAttribute("placeholder");

        Assert.assertEquals(expUsername, actUsername);

        String expPassword = "Password";
        String actPassword = loginPage.password.getAttribute("placeholder");
        Assert.assertEquals(expPassword, actPassword);

    }
}