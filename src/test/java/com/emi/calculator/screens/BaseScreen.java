package com.emi.calculator.screens;

import com.aventstack.extentreports.Status;
import com.emi.calculator.report.ReportTestManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseScreen extends Screen{
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        addInfo(locator.toString() + " going to operate");
        WebElement element=null;
        try {
            element= driver.findElement(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() +"locator not found");
        }
        addInfo(locator.toString() + " already did successfully operation");
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        addInfo(locator.toString() + " going to operate");
        List<WebElement> elements=null;
        try {
            elements= driver.findElements(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() +"locator not found");
        }
        addInfo(locator.toString() + " already did successfully operation");
        return elements;

    }

    @Override
    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }
}


