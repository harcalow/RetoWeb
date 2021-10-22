package com.co.orangehrmlive.opensourcedemo.userinterfaces.loginform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;


public class Login extends PageObject {
    public static final Target USERNAME = Target
            .the("Username")
            .located(id("txtUsername"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("txtPassword"));

    public static final Target LOGIN = Target
            .the("Login")
            .located(id("btnLogin"));

    //For validations.

    public static final Target MESSAGE_VALIDATION = Target
            .the("Message")
            .located(id("spanMessage"));

    public static final Target HOME_VALIDATION = Target
            .the("Home")
            .located(id("branding"));


}
