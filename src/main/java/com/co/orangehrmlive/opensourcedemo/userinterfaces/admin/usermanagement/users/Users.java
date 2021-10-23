package com.co.orangehrmlive.opensourcedemo.userinterfaces.admin.usermanagement.users;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class Users extends PageObject {
    public static final Target ADMIN = Target
            .the("Admin")
            .located(id("menu_admin_viewAdminModule"));

    public static final Target ADMIN_USERMANAGEMENT = Target
            .the("Usermanagement")
            .located(id("menu_admin_UserManagement"));

    public static final Target ADMIN_USERMANAGEMENT_USERS = Target
            .the("Users")
            .located(id("menu_admin_viewSystemUsers"));

    //Search Users
    public static final Target SEARCH_USERS_STATUS = Target
            .the("Search users status")
            .located(id("searchSystemUser_status"));

    public static final Target SEARCH = Target
            .the("Search")
            .located(id("searchBtn"));

    public static final Target SEARCH_STATUS_ALL = Target
            .the("Search status all")
            .located(xpath("//*[@id=\"searchSystemUser_status\"]/option[1]"));

    public static final Target SEARCH_STATUS_ENABLED = Target
            .the("Search status all")
            .located(xpath("//*[@id=\"searchSystemUser_status\"]/option[2]"));

    public static final Target SEARCH_STATUS_DISABLED = Target
            .the("Search status all")
            .located(xpath("//*[@id=\"searchSystemUser_status\"]/option[3]"));


    //For validations.
    public static final Target TABLE_VALIDATION = Target
            .the("Search status all")
            .located(id("tableWrapper"));


}
