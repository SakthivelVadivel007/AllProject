package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith (Cucumber.class)
@CucumberOptions (features = "src\\test\\resources\\FeatureFiles" ,
glue = {"org.test" , "org.hooks"},
monochrome = true,
dryRun = false,

//tags= " @Smoke or  @reg",
tags= "@Smoke",

snippets = SnippetType.CAMELCASE,

plugin = {"pretty", "html:target/report.html",
		"json:target/report.json",
		"junit:target/report.xml"
		})




public class RunnerClass {

	 
}
