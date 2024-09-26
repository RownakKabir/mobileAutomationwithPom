package com.emi.calculator.testcase;
import com.emi.calculator.screens.BaseScreen;
import com.emi.calculator.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    AndroidDriver driver ;
    Screen screen;

    @BeforeClass
    public void launchApp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "FEGEZTS8T4LNBI7L");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("deviceName", "narzo 50");
        capabilities.setCapability("appPackage", "com.continuum.emi.calculator");
        capabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("ignoreHiddenApiPolicyError", "true");
        capabilities.setCapability("noReset", "true");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            screen =new BaseScreen(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void closeApp() {
        driver.quit();
    }

    public void takeScreenshot() {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis()+ ".jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public AndroidDriver getWebDriver() {
        return driver;
    }
}

