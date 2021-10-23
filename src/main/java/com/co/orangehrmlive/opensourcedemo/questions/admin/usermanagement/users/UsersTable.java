package com.co.orangehrmlive.opensourcedemo.questions.admin.usermanagement.users;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.usermanagement.users.Users.TABLE_VALIDATION;

public class UsersTable implements Question<Boolean> {

    public UsersTable is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  (TABLE_VALIDATION.resolveFor(actor).isVisible());
    }

    public static UsersTable tableValidation(){
        return new UsersTable();
    }
}
