package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\kishan das\\Desktop\\TestNG\\Final_Cucumber_BDD_POM\\src\\test\\java\\com\\features\\LoginPage.feature",
		glue="com.stepDefinitionFiles",
		format= {"pretty","html:test-output","json:json-output/cucumber.json","junit:xml-output/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
public class Runner {

}
