package com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift;

import com.co.orangehrmlive.opensourcedemo.tasks.common.BaseSikulix;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sikuli.script.Screen;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.job.workshift.WorkShift.*;


public class DeleteWorkShifts extends BaseSikulix implements Task  {

    Screen s = new Screen();
    @Override
    public <T extends Actor> void performAs(T actor) {
        clickOn(SELECT_PICTURE_PATCH_DELETE);
        actor.attemptsTo(
                Click.on(DELETE),
                Click.on(OK)
                );
    }

    public static DeleteWorkShifts deleteWorkShifts(){
        return new DeleteWorkShifts();
    }
}
