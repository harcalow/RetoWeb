package com.co.orangehrmlive.opensourcedemo.questions.login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.co.orangehrmlive.opensourcedemo.userinterfaces.loginform.Login.MESSAGE_VALIDATION;

public class LoginMessage implements Question<Boolean> {

    public LoginMessage is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_VALIDATION.resolveFor(actor).isVisible());
    }

    public static LoginMessage loginMessage(){
        return new LoginMessage();
    }
}
