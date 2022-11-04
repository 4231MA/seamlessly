package com.seamlessly.step_definitions;

import com.seamlessly.pages.Login_Page;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Password_StepDefinitions {
    Login_Page loginPage = new Login_Page();

    @Given("User goes to Seamlessly login page")
    public void user_goes_to_seamlessly_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        loginPage.password.sendKeys("Employee123");
    }

    @Then("Verify that the default visibility of the password input box is dot")
    public void verify_that_the_default_visibility_of_the_password_input_box_is_dot() {
        String actualViewPassword = loginPage.password.getAttribute("type");
        String expectedViewPasswordDot = "password";

        Assert.assertEquals(actualViewPassword, expectedViewPasswordDot);
    }

    @When("User clicks the eye button")
    public void user_clicks_the_eye_button() {
        loginPage.eyeButton.click();
    }

    @Then("Verify that user can see password explicitly")
    public void verify_that_user_can_see_password_explicitly() {
        String actualView = loginPage.password.getAttribute("type");
        String expectedView = "text";
        Assert.assertEquals(expectedView, actualView);

    }


}
