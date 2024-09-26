package com.emi.calculator.testcase;

import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomeScreen homeScreen;
    @Test (priority = 0)
    public void checkAppName(){
        homeScreen= screen.getInstance(HomeScreen.class);
        Assert.assertEquals(homeScreen.getAppname(),"EMI Calculator");
    }
@Test(priority = 1)
  public void checkStartbutton(){

        Assert.assertTrue(homeScreen.hasStartbutton());
  }
 @Test (priority = 2)
    public void checkComparebutton(){

        Assert.assertTrue(homeScreen.hasCompareBtn());
    }
@Test(priority = 1)
    public void checkStartbtnName(){
        homeScreen= screen.getInstance(HomeScreen.class);
        Assert.assertEquals(homeScreen.getStartbuttontext(),"EMI Calculator");
    }
@Test(priority = 2)
    public void checkComparebtnName(){
        homeScreen= screen.getInstance(HomeScreen.class);
        Assert.assertEquals(homeScreen.getComparebuttontext(),"Compare Loans");
    }

}
