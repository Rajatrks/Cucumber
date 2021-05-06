package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\checkout\\CucumberDemo\\src\\test\\resources\\Features\\login.feature",   // path of feature file
   glue= {"StepDefinitions"},  // path of step definition file
   plugin= {"pretty","html:target/cucumber-reports"},  // to generate the report
   monochrome= true            // make it in readable format avoid unnecessary things in console
   )               // map each feature steps with step definitions, always give false

public class TestRunner {

}