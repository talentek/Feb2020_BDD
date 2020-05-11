package bdd.ups.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeActions(Scenario scen){
		System.out.println("===============Driver Initialization================");
		SetupDrivers.setupChromeDriver();
		System.out.println(scen.getName());
	}
	
	
}
