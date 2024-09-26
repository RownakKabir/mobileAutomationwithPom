package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmidetailsScreen extends BaseScreen {
    public EmidetailsScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean hasDetailsresult(){
        waitForElement(By.id("layoutDetailContainer"));
        return getWebElements(By.id("layoutDetailContainer")).size()>0;
    }

    public EmicalculatorScreen tapBackbtn(){
        waitForElement(By.id("actionMenuBack"));
        getWebElement(By.id("actionMenuBack")).click();

        return getInstance(EmicalculatorScreen.class);
    }
}
