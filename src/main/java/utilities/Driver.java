package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-blink-features=AutomationControlled");
                    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                    options.setExperimentalOption("useAutomationExtension", false);
                    options.addArguments("user-data-dir=/path/to/unique/directory");
                    options.addArguments("--no-sandbox", "--disable-dev-shm-usage");

                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                    ((JavascriptExecutor) driver).executeScript(
                            "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})");
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // ✅ Bu overload metodu ekle
    public static WebDriver getDriver(ChromeOptions options) {
        if (driver == null) {
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
