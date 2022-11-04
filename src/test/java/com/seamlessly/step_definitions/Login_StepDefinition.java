package com.seamlessly.step_definitions;

import com.seamlessly.pages.Login_Page;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    Login_Page loginPage = new Login_Page();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @Given("user enter correct username {string}")
    public void user_enter_correct_username(String string) {
        loginPage.userName.sendKeys("Employee61");
    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
        loginPage.password.sendKeys("Employee123");
    }

    @Then("user should see the dashboard page")
    public void user_should_see_the_dashboard_page() {


       Assert.assertTrue(loginPage.seamlesslyLogo.isDisplayed());

    }


}
