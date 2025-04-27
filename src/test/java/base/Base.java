package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.ITestResult;
import utilities.Driver;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Base {

    protected static ExtentReports extent;
    protected static ExtentTest extentTest;
    protected ExtentSparkReporter htmlReporter;
    protected WebDriver driver;

    @BeforeSuite
    public void setUpSuite() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String reportPath = "test-output/ExtentReport_" + timestamp + ".html";
        htmlReporter = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Environment", "Test");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @BeforeMethod
    public void setUpTest(Method method) {
        extentTest = extent.createTest(method.getName());
        driver = Driver.getDriver();  // <-- WebDriver başlat
    }

    @AfterMethod
    public void tearDownTest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.fail("Test Case Failed: " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Case Skipped: " + result.getThrowable());
        } else {
            extentTest.pass("Test Case Passed");
        }

        Driver.closeDriver(); // <-- WebDriver kapat
    }

    @AfterSuite
    public void tearDownSuite() {
        extent.flush();
    }
}
