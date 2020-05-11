package bdd.ups.utilities;

import cucumber.api.java.After;

public class AfterActions {

	@After
	public void afterActions() {
		SetupDrivers.tearDownChromeDriver();
	}

}
