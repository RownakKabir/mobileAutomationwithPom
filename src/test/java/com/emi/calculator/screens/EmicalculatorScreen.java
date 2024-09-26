package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmicalculatorScreen extends  BaseScreen{
    public EmicalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

 public EmicalculatorScreen fillAmount(int amount){
        getWebElement(By.id("etLoanAmount")).sendKeys(String.valueOf(amount));
        return this;
 }

 public EmicalculatorScreen fillInterest(double interest){
        getWebElement(By.id("etInterest")).sendKeys(String.valueOf(interest));
        return this;
    }
    public EmicalculatorScreen fillYear(int year){
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(year));
        return this;
    }

    public EmicalculatorScreen fillMonth(int month){
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(month));
        return this;
    }


    public EmicalculatorScreen fillProcessingFee(int fee){
        getWebElement(By.id("etFee")).sendKeys(String.valueOf(fee));
        return this;
    }


    public EmicalculatorScreen tabCalculatorBtn(){
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public EmicalculatorScreen tabResetBtn(){
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public boolean hasTitle(){
            waitForElement(By.id("toolbar"));
        return getWebElements(By.id("toolbar")).size()>0;
        }



    public boolean hasResult(){
        return getWebElements(By.id("layoutTable")).size()>0;
    }

    public boolean hasDetailbtn(){

        return getWebElements(By.id("btnCalculate")).size()>0;
    }

    public EmidetailsScreen tabDetailBtn(){
        waitForElement(By.id("btnDetail"));
        getWebElement(By.id("btnDetail")).click();
        return getInstance(EmidetailsScreen.class);
    }


}
