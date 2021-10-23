package com.co.orangehrmlive.opensourcedemo.questions.admin.job.workshift;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.job.workshift.WorkShift.MESSAGE_VALIDATION;


public class WorkshiftMessage implements Question<Boolean> {

    public WorkshiftMessage is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (MESSAGE_VALIDATION.resolveFor(actor).isVisible());
    }

    public static WorkshiftMessage workshiftMessage(){
        return new WorkshiftMessage();
    }
}
