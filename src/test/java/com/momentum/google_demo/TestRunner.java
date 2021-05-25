package com.momentum.google;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/google"},
        glue = {"com.momentum.google.step_definitions"},
        tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
