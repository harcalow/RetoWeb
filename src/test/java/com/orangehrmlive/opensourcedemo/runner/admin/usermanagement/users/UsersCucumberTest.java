package com.orangehrmlive.opensourcedemo.runner.admin.usermanagement.users;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\features.webui\\admin\\usermanagement\\users\\Users.feature"},
        glue = {"com\\orangehrmlive\\opensourcedemo\\stepdefinition\\admin\\usermanagement\\users"},
        tags = {"not @ignore"}
)
public class UsersCucumberTest {
}
