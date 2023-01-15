package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failreport.html",
glue = "org.test",
monochrome = true, 
plugin = {"pretty", "html:target1/report.html",
		"json:target1/report.json",
		"junit:target1/repotr.xml"}
		
		
		)




public class RunnerClassForFailTestCases {
	

}
