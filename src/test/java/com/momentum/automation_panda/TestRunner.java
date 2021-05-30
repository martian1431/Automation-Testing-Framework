package com.momentum.automation_panda;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/automation_panda"},
        glue = {"com.momentum.automation_panda.step_definitions"},
        tags = "@Automation_Panda"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
