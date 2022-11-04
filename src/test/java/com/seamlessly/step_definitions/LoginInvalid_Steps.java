package com.seamlessly.step_definitions;

import com.seamlessly.pages.Login_Page;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginInvalid_Steps {
    Login_Page loginPage = new Login_Page();

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String username) {
        loginPage.userName.sendKeys(username);

    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("user click the Log in button")
    public void user_click_the_log_in_button() {
        loginPage.logInButton.click();
    }

    @Then("user should not login with invalid credentials")
    public void user_should_not_login_with_invalid_credentials() {

        String expectedTitle = "Seamlessly";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }


    @And("user see {string} message")
    public void userSeeMessage(String message) {

        Assert.assertTrue(loginPage.wrongMessage.isDisplayed());
        Assert.assertTrue(loginPage.warningMessage.isDisplayed());

       /*
        WebElement m = Driver.getDriver().findElement(By.id("user"));
        String act = m.getText();
        String exp = "Please fill out this field.";
        Assert.assertEquals(exp, act);

        */


    }
}
