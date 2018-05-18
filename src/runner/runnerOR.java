package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerOR {
	@RunWith(Cucumber.class)
	@CucumberOptions(features= {"FeaturesTwo"},glue={"Orange123Step"})
	public class RunnerOr {
}
}