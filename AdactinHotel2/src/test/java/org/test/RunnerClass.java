package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/FeatureFiles/1.LogInPage.feature" ,
glue = {"org.test"},
monochrome = true,
dryRun = false,

//tags= " @Smoke or  @reg",
tags= "@Smoke",

snippets = SnippetType.CAMELCASE,

plugin = {"pretty", "html:target/report.html",
		"json:target/report.json",
		"junit:target/report.xml"
		, "rerun: target/failreport.html"
		})




public class RunnerClass {

	 
}
