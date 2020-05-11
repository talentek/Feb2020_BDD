package bdd.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginElements {
	@FindBy(name = "userID")
	public WebElement userId;

	@FindBy(xpath = "//*[@id='pwd']")
	public WebElement password;

	@FindBy(id = "submitBtn")
	public WebElement submitBtn;

	@FindBy(xpath = "//*[@id='errorMessages']")
	public WebElement errorMsg;

}
