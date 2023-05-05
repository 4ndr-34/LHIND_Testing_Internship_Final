package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/FlightPlanning.feature",
        glue = {"stepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
