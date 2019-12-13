package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="features/Test2.feature",glue={"StepDefination"},plugin={"html:target/cucumber-html-report",
		"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" })						
public class Runner 				
{		

}