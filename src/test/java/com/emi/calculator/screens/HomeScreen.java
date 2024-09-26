package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {

    private  By Startbtn=By.id("btnStart");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppname() {
        waitForElement(By.id("appName"));
        return getWebElement(By.id("appName")).getText().trim();
    }


    public EmicalculatorScreen tapstartButton() {
        waitForElement(Startbtn);
        getWebElement(Startbtn).click();
        return getInstance(EmicalculatorScreen.class);
    }

    public CompareLoanScreen tapCompareButton() {
        waitForElement(By.id("btnCompare"));
        getWebElement(By.id("btnCompare")).click();
        return getInstance(CompareLoanScreen.class);
    }


    public boolean hasStartbutton(){

     return getWebElements(Startbtn).size() >0 ;
    }


    public  String  getStartbuttontext(){
        return getWebElement(By.id("btnStart")).getText().trim();
    }


    public boolean hasCompareBtn() {
       return getWebElements(By.id("btnCompare")).size()>0;
    }

    public  String  getComparebuttontext(){
        return getWebElement(By.id("btnCompare")).getText();
    }
}
