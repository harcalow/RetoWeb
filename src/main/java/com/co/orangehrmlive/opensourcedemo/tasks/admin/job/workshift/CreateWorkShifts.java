package com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.job.workshift.WorkShift.*;
import static com.co.orangehrmlive.opensourcedemo.userinterfaces.login.Login.PASSWORD;

public class CreateWorkShifts implements Task {
    private String nameWorkShift;
    private String hourFrom;
    private String hourTo;

    public CreateWorkShifts usingNameWorkShift(String nameWorkShift) {
        this.nameWorkShift = nameWorkShift;
        return this;
    }
    public CreateWorkShifts usingHourFrom(String hourFrom) {
        this.hourFrom = hourFrom;
        return this;
    }
    public CreateWorkShifts usingHourTo(String hourTo) {
        this.hourTo = hourTo;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ADDWORKSHIFTS),
                Click.on(ADDWORKSHIFTS),
                Scroll.to(NAMEWORKSHIFTS),
                Enter.theValue(this.nameWorkShift).into(NAMEWORKSHIFTS),
                Click.on(By.xpath("//*[@id=\"workShift_workHours_from\"]/option[. = '"+this.hourFrom+"']")),
                Click.on(By.xpath("//*[@id=\"workShift_workHours_to\"]/option[. = '"+this.hourTo+"']")),
                Click.on(WORKERONE),
                Click.on(ASSIGNEMPLOYEE),
                Click.on(SAVE)
                );
    }



    public static CreateWorkShifts createWorkShifts(){
        return new CreateWorkShifts();
    }
}
