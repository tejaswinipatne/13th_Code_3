package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/myfeature.feature", glue={"StepDefination"}, plugin ={"html:target/cucumber-html-report" })
public class Runner {

}
