package com.project.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Base{

    //Elementos de la pagina register

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
    By registerBtnLocator = By.name("submit");
    By registeredMessage = By.tagName("font");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser(){
        click(registerLinkLocator); // damos click en el link de registro
        implicitWait(5);  // le decimos que espere 5 segundos con implicitWait
        if(isDisplayed(registerPageLocator)){          //condicion que nos dice si estamos en la pagina correcta
            type("Carlos",usernameLocator);
            type("1234",passwordLocator);
            type("1234",confirmPasswordLocator);
            click(registerBtnLocator);
        }else{
            System.out.println("Register page was not found");
        }
    }

    public String registeredMessage(){
        List<WebElement> fonts = findElements(registeredMessage);
        return getText(fonts.get(5));
    }
}
