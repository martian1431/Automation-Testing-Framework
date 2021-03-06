package com.fourteen31.ibrs_smoke_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/ibrswealthdemo"},
        glue = {"com.fourteen31.ibrs_smoke_test.step_definitions"},
        tags = "@IBRS_Wealth_Instance_Smoke_test"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}