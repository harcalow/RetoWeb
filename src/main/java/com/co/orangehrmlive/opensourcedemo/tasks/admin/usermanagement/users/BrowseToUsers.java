package com.co.orangehrmlive.opensourcedemo.tasks.admin.usermanagement.users;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.usermanagement.users.Users.*;

public class BrowseToUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ADMIN),
                Click.on(ADMIN),
                Click.on(ADMIN_USERMANAGEMENT),
                Click.on(ADMIN_USERMANAGEMENT_USERS)
        );
    }

    public static BrowseToUsers browseToUsers(){
        return new BrowseToUsers();
    }
}
