package com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.job.workshift;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class WorkShift extends PageObject {
    public static final Target ADMIN = Target
            .the("Admin")
            .located(id("menu_admin_viewAdminModule"));

    public static final Target ADMIN_JOB = Target
            .the("Job")
            .located(id("menu_admin_Job"));

    public static final Target ADMIN_JOB_WORKSHIFT = Target
            .the("Work shift")
            .located(id("menu_admin_workShift"));

    //

    public static final Target ADDWORKSHIFTS = Target
            .the("Add Work shift")
            .located(id("btnAdd"));

    public static final Target NAMEWORKSHIFTS = Target
            .the("Name Work shift")
            .located(id("workShift_name"));

    public static final Target WORKERONE= Target
            .the("Available employee")
            .located(xpath("//*[@id=\"workShift_availableEmp\"]/option[1]"));

    public static final Target ASSIGNEMPLOYEE= Target
            .the("Assign employee")
            .located(id("btnAssignEmployee"));

    public static final Target SAVE= Target
            .the("Save")
            .located(id("btnSave"));

    //For validations.
    public static final Target MESSAGE_VALIDATION= Target
            .the("Message Validation")
            .located(className("message"));
}
