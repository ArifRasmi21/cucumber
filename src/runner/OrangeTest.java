package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"featuresTwo"},glue={"OrangeDif"},tags={"@First"}
)
public class OrangeTest {

}
