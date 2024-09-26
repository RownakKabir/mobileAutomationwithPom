package com.emi.calculator.testcase;

import com.emi.calculator.screens.CompareLoanScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanTest extends BaseTest{
    CompareLoanScreen compareLoanScreen;

    @Test(priority = 0)
    public void compareLoansShouldSucceed() {
        compareLoanScreen = screen.getInstance(HomeScreen.class)
                .tapCompareButton()
                .fillLoanAmount1(500000)
                .fillInterestrate1(9)
                .fillMonth1(12)
                .fillLoanAmount2(500000)
                .fillInterestrate2(10)
                .fillMonth2(12)
                .tabCalculatorBtn();
        Assert.assertTrue(compareLoanScreen.hasResultLayout());

    }

    @Test(priority = 1)
    public void resetCompareLoansShouldSucceed() {
        compareLoanScreen = compareLoanScreen
                .tapResetBtn();
        Assert.assertFalse(compareLoanScreen.hasResultLayout());
    }
}
