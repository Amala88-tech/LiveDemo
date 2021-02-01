package org.test;


import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},
glue= {"org.step"},
plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"},
monochrome=true)

public class TestRunner {
@AfterClass
public static void jVMRep() {
	JVMReport.generateJvmReport("C:\\Users\\DEEPESH\\eclipse-workspace\\LiveDemo\\target\\cucumber.json");

}


}




