package com.co.orangehrmlive.opensourcedemo.tasks.loginform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.loginform.Login.*;

public class FullLogin implements Task {

    private String userName;
    private String password;

    public FullLogin usingUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public FullLogin usingPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USERNAME),
                Enter.theValue(userName).into(USERNAME),

                Scroll.to(PASSWORD),
                Enter.theValue(this.password).into(PASSWORD),

                Scroll.to(LOGIN),
                Click.on(LOGIN)

        );

    }

    public static FullLogin fillPracticeForm(){
        return new FullLogin();
    }
}
