package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "user")
    public WebElement userName;


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton;


    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement seamlesslyLogo;


    @FindBy(xpath = "//p[normalize-space()='Wrong username or password.']")
    public WebElement wrongMessage;


    @FindBy(xpath = "//p[@class='warning throttledMsg']")
    public WebElement warningMessage;


    @FindBy(xpath = "//img[@alt='Toggle password visibility']")
    public WebElement eyeButton;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;


    @FindBy(id = "reset-password-submit")
    public WebElement resetPassword;


   // @FindBy(xpath = "//input[@placeholder='Username or email']")
   // public WebElement usernameOrEmail;






}
