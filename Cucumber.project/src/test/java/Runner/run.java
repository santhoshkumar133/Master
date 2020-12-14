package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/cucumber",
glue= {"stepDefinitions"},
format= {"pretty","html:test-output"},
monochrome = true,
dryRun = false
)


public class run {

}
