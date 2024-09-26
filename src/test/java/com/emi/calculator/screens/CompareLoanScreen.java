package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CompareLoanScreen extends BaseScreen{
    public CompareLoanScreen(AndroidDriver driver) {
        super(driver);
    }
  public CompareLoanScreen fillLoanAmount1(int amount){
        getWebElement(By.id("etLoanAmount1")).sendKeys(String.valueOf(amount));
        return this;
  }

    public CompareLoanScreen fillInterestrate1(double rate){
        getWebElement(By.id("etInterest1")).sendKeys(String.valueOf(rate));
        return this;
    }
    public CompareLoanScreen fillMonth1(int month){
        getWebElement(By.id("etPeriod1")).sendKeys(String.valueOf(month));
        return this;
    }


    public CompareLoanScreen fillLoanAmount2(int amount){
        getWebElement(By.id("etLoanAmount2")).sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoanScreen fillInterestrate2(double rate){
        getWebElement(By.id("etInterest2")).sendKeys(String.valueOf(rate));
        return this;
    }
    public CompareLoanScreen fillMonth2(int month){
        getWebElement(By.id("etPeriod2")).sendKeys(String.valueOf(month));
        return this;
    }


    public CompareLoanScreen tabCalculatorBtn(){
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }


    public boolean hasResultLayout() {
        return getWebElements(By.id("layoutTable")).size() > 0;
    }


    public CompareLoanScreen tapResetBtn() {
        getWebElement(By.id("btnReset")).click();
        return this;
    }




}
