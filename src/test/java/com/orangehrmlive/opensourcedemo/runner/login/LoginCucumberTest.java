package com.orangehrmlive.opensourcedemo.runner.login;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\features.webui\\login\\login.feature"},
        glue = {"com\\orangehrmlive\\opensourcedemo\\stepdefinition\\login"},
        tags = {"not @ignore"}
)
public class LoginCucumberTest {
}
