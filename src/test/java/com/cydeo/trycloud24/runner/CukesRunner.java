package com.cydeo.trycloud24.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features" ,
        glue = "com/cydeo/trycloud24/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}


