package org.test;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\InstaLogInPage.feature", glue = "org.test",
monochrome = true,
plugin = {"pretty", "html:src\\test\\resources\\Report"}
// strict=true,

)

public class RunnerClass {

}
