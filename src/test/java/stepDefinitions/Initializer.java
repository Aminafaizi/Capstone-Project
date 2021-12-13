package stepDefinitions;

	import core.Base;
	import io.cucumber.java.After;
		import io.cucumber.java.Before;
		import io.cucumber.java.Scenario;
		public class Initializer extends Base {
			
			
			@Before
			public void beforHooks(Scenario scenario) {
				logger.info("Scenario " + scenario.getName() + " Started");
				browser();// this method comes from Base class and will lunch browser
				openBrowser();// this method comes from Base class and will lunch url
			}
			@After
			public void afterHooks(Scenario scenario) {
				CloseBrowser();
				logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
				

}
		}
