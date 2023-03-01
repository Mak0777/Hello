package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
features = "src/test/resources/features",
glue = "stepDefinations")

public class TestRunner {

}





