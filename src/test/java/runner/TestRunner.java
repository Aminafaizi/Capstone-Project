package runner;


	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "classpath:features", //to link to feature files folder
			glue = "stepDefinitions", // to link to stepDefinitions folder
			tags = "@smokeTest", // will run one scenario , or multiple scenarios, or entire feature
			dryRun= false, //checks if there are any missing steps in stepDefinition class for each scenario
			monochrome= true,//Will make console to readable
			strict = true,     // will mark scenario failed if there are any pending steps
			plugin = {"pretty"}, // to make result reasable
			publish = true // to publish to consule
			)
	public class TestRunner {

}
