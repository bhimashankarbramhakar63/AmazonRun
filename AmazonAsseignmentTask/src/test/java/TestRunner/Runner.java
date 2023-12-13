package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",glue ={"stepdefinitions"},
         tags = "@smoke",
         plugin = {"pretty",
		"html:target/cucumber-reports/cucumber-pretty"
})
public class Runner {

}
	