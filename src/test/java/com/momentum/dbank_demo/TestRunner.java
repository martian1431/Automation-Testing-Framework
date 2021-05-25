package com.momentum.dbank_demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/dbankdemo"},
        glue = {"com.momentum.dbank_demo.step_definitions"},
        tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
