package com.fourteen31.guru99_demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/guru99_demo"},
        glue = {"com.fourteen31.guru99_demo.step_definitions"},
        tags = "@Guru99_Regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
