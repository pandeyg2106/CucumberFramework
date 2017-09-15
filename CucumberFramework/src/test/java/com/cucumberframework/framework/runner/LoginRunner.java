package com.cucumberframework.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"classpath:featurefile/Login.feature"}, glue = {
		"classpath:com.cucumberframework.framework.stepdefinitions",
		"classpath:com.cucumberframework.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class LoginRunner extends AbstractTestNGCucumberTests{

}
