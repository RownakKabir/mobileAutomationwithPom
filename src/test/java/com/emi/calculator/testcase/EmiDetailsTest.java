package com.emi.calculator.testcase;

import com.emi.calculator.screens.EmicalculatorScreen;
import com.emi.calculator.screens.EmidetailsScreen;
import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiDetailsTest extends BaseTest {
    EmidetailsScreen emidetailsScreen;
    @Test(priority =0)
    public  void EmiDetailsShouldSuccessed(){
        emidetailsScreen=  screen.getInstance(HomeScreen.class)
                .tapstartButton()
                .fillAmount(2500)
                .fillInterest(5.21)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessingFee(2)
                .tabCalculatorBtn()
                .tabDetailBtn();

        Assert.assertTrue(emidetailsScreen.hasDetailsresult());
}

    @Test(priority =1)
    public  void backEmiShouldSuccessed(){
       EmicalculatorScreen emicalculatorScreen= emidetailsScreen.tapBackbtn();
        Assert.assertTrue(emicalculatorScreen.hasTitle());
    }

}
