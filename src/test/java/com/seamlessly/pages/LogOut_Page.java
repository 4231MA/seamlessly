package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Page {

   public LogOut_Page(){

       PageFactory.initElements(Driver.getDriver(),this);

   }

   @FindBy(xpath = "//img[@src='/index.php/avatar/Employee61/32?v=0']")
    public WebElement profileButton;

   @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[5]/a")
    public WebElement logOutButton;










}
