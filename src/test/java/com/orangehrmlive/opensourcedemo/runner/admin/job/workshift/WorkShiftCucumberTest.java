package com.orangehrmlive.opensourcedemo.runner.admin.job.workshift;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\features.webui\\admin\\job\\workshift\\workshift.feature"},
        glue = {"com\\orangehrmlive\\opensourcedemo\\stepdefinition\\admin\\job\\workshift"},
        tags = {"not @ignore"}
)
public class WorkShiftCucumberTest {
}

