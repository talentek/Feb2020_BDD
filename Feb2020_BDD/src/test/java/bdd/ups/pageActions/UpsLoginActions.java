package bdd.ups.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import bdd.ups.pageElements.UpsLoginElements;
import bdd.ups.utilities.SetupDrivers;

public class UpsLoginActions {
	UpsLoginElements loginPageElements;

	public UpsLoginActions() {
		this.loginPageElements = new UpsLoginElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, loginPageElements);
	}

	public void getUpsLoginPage() {

		SetupDrivers.chromeDriver.get("https://www.ups.com/lasso/login?loc=en_US");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputUserID(String str) {
		loginPageElements.userId.sendKeys(str);
	}

	public void inputPassword(String str) {
		loginPageElements.password.sendKeys(str);
	}

	public void submit() {
		loginPageElements.submitBtn.click();
	}

	public String errorMsg() {
		return loginPageElements.errorMsg.getText();
	}

	public String loginButtonText() {
		return loginPageElements.submitBtn.getText();
	}
	
	public String getLoginPageTitle(){
		String upsLoginPageTitle =  SetupDrivers.chromeDriver.getTitle();
		return upsLoginPageTitle;
	}
	
	public String getHomePageTitle(){
		String upsHomePageTitle =  SetupDrivers.chromeDriver.getTitle();
		return upsHomePageTitle;
	}
}
