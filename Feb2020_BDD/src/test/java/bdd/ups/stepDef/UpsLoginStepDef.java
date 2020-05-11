package bdd.ups.stepDef;

import org.testng.Assert;

import bdd.ups.pageActions.UpsLoginActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsLoginStepDef {

	UpsLoginActions upsLogin = new UpsLoginActions();

	@Given("^UPS login page launched$")
	public void ups_login_page_launched() {
		upsLogin.getUpsLoginPage();
		String expectedTitle = "Login | UPS - United States";
		String actualTitle = upsLogin.getLoginPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@When("^Customer input wrong Username \"([^\"]*)\" and wrong Password \"([^\"]*)\"$")
	public void customer_input_wrong_Username_and_wrong_Password(String username, String password) {
		upsLogin.inputUserID(username);
		upsLogin.inputPassword(password);
	}

	@When("^Customer clicks on LogIn button$")
	public void customer_clicks_on_LogIn_button() {
		upsLogin.submit();
	}

	@Then("^Customer should receive an error message$")
	public void customer_should_receive_an_error_message() {
		String actualErrorMessage = upsLogin.errorMsg();

		boolean bool = false;

		if (actualErrorMessage.contains("unsuccessful attempts")) {
			bool = true;
		}

		Assert.assertEquals(bool, true);

	}

	@When("^Customer input correct Username \"([^\"]*)\" and correct Password \"([^\"]*)\"$")
	public void customer_input_correct_Username_and_correct_Password(String username, String password) {
		upsLogin.inputUserID(username);
		upsLogin.inputPassword(password);
	}

	@Then("^Customer should be able to login$")
	public void customer_should_be_able_to_login() {
		String expectedTitle = "Home | UPS - United States";
		String actualTitle = upsLogin.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
