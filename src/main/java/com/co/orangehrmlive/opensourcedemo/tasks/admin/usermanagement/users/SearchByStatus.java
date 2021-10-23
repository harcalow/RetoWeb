package com.co.orangehrmlive.opensourcedemo.tasks.admin.usermanagement.users;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Enabled;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.usermanagement.users.Users.*;
import static com.co.orangehrmlive.opensourcedemo.util.Status.ALL;
import static com.co.orangehrmlive.opensourcedemo.util.Status.ENABLED;

public class SearchByStatus implements Task {
    private String status;
    public SearchByStatus usingStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SEARCH_USERS_STATUS),
                Click.on(SEARCH_USERS_STATUS),
                Check.whether(ALL.getValue().equals(status))
                                .andIfSo(
                                        Click.on(SEARCH_STATUS_ALL)
                                )
                        .otherwise(
                                Check.whether(ENABLED.getValue().equals(status))
                                        .andIfSo(
                                                Click.on(SEARCH_STATUS_ENABLED)
                                        ).otherwise(
                                                Click.on(SEARCH_STATUS_DISABLED)
                                        )
                        )
               , Click.on(SEARCH)
        );
    }

    public static SearchByStatus searchByStatus(){
        return new SearchByStatus();
    }
}
