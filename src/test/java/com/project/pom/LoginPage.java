package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By loginBtnLocator = By.name("submit");
    By homePageLocator = By.xpath("//h3");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(){
        if(isDisplayed(userLocator)){
            type("Carlos",userLocator);
            type("1234",passLocator);
            click(loginBtnLocator);
        }else {
            System.out.println("Username text box not present");
        }
    }

    public Boolean isHomePageDisplayed(){
        System.out.println(getText(homePageLocator)+ " == "+"Login Successfully");
        if(getText(homePageLocator).equals("Login Successfully")){
            return true;
        }else{
            return false;
        }
    }


}
