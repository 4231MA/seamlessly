package com.seamlessly.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    /*
    This method will accept int (int seconds) and execute Thread.sleep
    for given duration
     */

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

    /*
    This method accepts 3 arguments:
    Arg1: webdriver
    Arg2: exceptedInUrl: for verifying if thr Url contains the given String
        -If condition matches, will break loop
    Arg3: exceptedInTitle to be compared against the actual title

     */
    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle) {


        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */
    public static void verifyTitle( String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    /*
    Creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


    public static void verifyUrlContains(String expectedInUrl){

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));

    }

//this method will accept a dropdown as a WebElement
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement ){

        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {

            actualOptionsAsString.add(each.getText());

        }

        return actualOptionsAsString;

    }

// This method will accept a group radio buttons as a List of WebElements
    //It will loop through the list, and clict to the radio button with provided attributeValue
public static  void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

    for (WebElement each : radioButtons) {
        if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
            each.click();
        }

    }

}




}
