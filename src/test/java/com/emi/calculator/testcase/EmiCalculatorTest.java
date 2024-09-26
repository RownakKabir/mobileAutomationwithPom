package com.emi.calculator.testcase;

import com.emi.calculator.common.General;
import com.emi.calculator.screens.EmicalculatorScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest {

    EmicalculatorScreen emicalculatorScreen;

    @Test(priority = 0)
    public void CalculatorEmiShouldSuccessed() {

        emicalculatorScreen = screen.getInstance(HomeScreen.class)
                .tapstartButton()
                .fillAmount(2500)
                .fillInterest(5.21)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessingFee(2)
                .tabCalculatorBtn();
        Assert.assertTrue(emicalculatorScreen.hasResult());

    }

    @Test(priority = 1)
    public void CheckResult() {
        Assert.assertTrue(emicalculatorScreen.hasResult());
    }

    @Test(priority = 2)
    public void CheckDetailsBtn() {
        Assert.assertTrue(emicalculatorScreen.hasDetailbtn());
    }

    @Test(priority = 3)
    public void checkResetBTn() {
        emicalculatorScreen.tabResetBtn();
        Assert.assertFalse(emicalculatorScreen.hasResult());
    }
    @DataProvider
    public Object[][] getDataProviderData() {
        return General.getTestData("Sheet1");
    }



    @Test(priority = 2, dataProvider = "getDataProviderData")
    public void calculateEmiShouldSucceed2(String amount, String rate) {
        emicalculatorScreen = emicalculatorScreen
                .fillAmount(Integer.valueOf(amount.replaceAll(".0", "")))
                .fillInterest(Double.valueOf(rate))
                .fillYear(2)
                .fillMonth(2)
                .fillProcessingFee(2)
                .tabCalculatorBtn();
        Assert.assertTrue(emicalculatorScreen.hasResult());
    }

}