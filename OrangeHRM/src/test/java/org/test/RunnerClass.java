package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)

@CucumberOptions (features = "src\\test\\resources\\FeatureFiles\\OrangeHRMLogin.feature",
glue = "org.test",
monochrome = true,

dryRun = false,
 strict = true,
 
 plugin = {"pretty", "html:target/report.html",
		 "json:target/report.json",
		 "junit:target/report.xml"},
 snippets = SnippetType.CAMELCASE


)
public class RunnerClass {
	

}
