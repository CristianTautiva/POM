package com.project.test;
import com.project.pom.RegisterPage;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
public class RegisterTest {

    private WebDriver driver;
    RegisterPage registerPage;

    @Before
    public void setUp(){
        registerPage = new RegisterPage(driver);
        driver = registerPage.getDriver();
        registerPage.visit("http://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test(){
       registerPage.registerUser();
       assertEquals("Note: Your user name is Carlos.",registerPage.registeredMessage());
    }
}
