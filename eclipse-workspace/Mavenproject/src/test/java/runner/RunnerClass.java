package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/OpenGoogle.feature", glue="stepdefinition", 
                          monochrome = true)
public class RunnerClass {

		//it Should combine the feature file and the step definition
	//Runner Define 
	
	
}
