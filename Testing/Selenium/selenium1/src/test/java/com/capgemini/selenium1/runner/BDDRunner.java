package com.capgemini.selenium1.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue= {"com.capgemini.selenium1.login"})
public class BDDRunner {

}
