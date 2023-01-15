package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\LogInPage.feature",
glue="org.test", 
plugin = {"pretty", "html:target/report/repotr.html"})

public class RunnerClass {

}
