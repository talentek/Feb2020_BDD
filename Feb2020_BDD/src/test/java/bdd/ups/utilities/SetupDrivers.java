package bdd.ups.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver chromeDriver;

	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().version("81.0.4044.138").setup();
		chromeDriver = new ChromeDriver();
	}

	public static WebDriver getChromeDriver() {
		return chromeDriver;
	}

	public static void tearDownChromeDriver() {
		chromeDriver.quit();
	}

}
