import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory

String driverPath = DriverFactory.getChromeDriverPath()
System.setProperty("webdriver.chrome.driver", driverPath)

ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("excludeSwitches", ["enable-automation"])
options.addArguments("--app=http://www.google.com");
driver = new ChromeDriver (options);