package com.jcg.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//testing
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CalculatorTest {
}


//testing