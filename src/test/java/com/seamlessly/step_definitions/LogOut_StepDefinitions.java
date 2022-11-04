package com.seamlessly.step_definitions;

import com.seamlessly.pages.LogOut_Page;
import com.seamlessly.pages.Login_Page;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOut_StepDefinitions {

    Login_Page loginPage = new Login_Page();
    LogOut_Page logOutPage = new LogOut_Page();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.userName.sendKeys("Employee61");
        loginPage.password.sendKeys("Employee123");
        loginPage.logInButton.click();
    }

    @Given("User clicks on profile button")
    public void user_clicks_on_profile_button() {
        logOutPage.profileButton.click();
    }

    @When("User user clicks on logout button")
    public void user_user_clicks_on_logout_button() {
        logOutPage.logOutButton.click();
    }

    @Then("User should end up in login page")
    public void user_should_end_up_in_login_page() {
        String expTitle = "Seamlessly";
        String actTitle = Driver.getDriver().getTitle();
       Assert.assertEquals(expTitle,actTitle);
    }
    @When("User clicks on the step back button")
    public void user_clicks_on_the_step_back_button() {
Driver.getDriver().navigate().back();
    }
    @Then("User should be still on the login page")
    public void user_should_be_still_on_the_login_page() {
        String expTitle = "Seamlessly";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expTitle,actTitle);
    }


}
