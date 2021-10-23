package com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.job.workshift.WorkShift.*;

public class BrowseToWorkShift implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ADMIN),
                Click.on(ADMIN),
                Click.on(ADMIN_JOB),
                Click.on(ADMIN_JOB_WORKSHIFT)
        );
    }
    public static BrowseToWorkShift browseToWorkShift(){
        return new BrowseToWorkShift();
    }
}
