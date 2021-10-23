package com.co.orangehrmlive.opensourcedemo.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.login.Login.*;

public class LoginHome implements Question<Boolean> {

    public LoginHome is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (HOME_VALIDATION.resolveFor(actor).isVisible());
    }

    public static LoginHome loginHome(){
        return new LoginHome();
    }
}
