package com.project.test;

import com.project.pom.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    private WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp(){
        loginPage = new LoginPage(driver);
        driver = loginPage.getDriver();
        loginPage.visit("http://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void test(){
        loginPage.login();
        loginPage.implicitWait(5);
        assertTrue(loginPage.isHomePageDisplayed());
    }
}
