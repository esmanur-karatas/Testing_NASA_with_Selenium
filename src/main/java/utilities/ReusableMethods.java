package utilities;

import org.openqa.selenium.*;

import java.io.File;
import java.util.*;

import static utilities.Driver.getDriver;

public class ReusableMethods {

    public static void sleep(int miliseconds) throws InterruptedException {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollPageOne() throws InterruptedException {
        WebDriver driver = getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver instance is null. Please initialize the driver first.");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
    }

    public static void scrollPageTwice() throws InterruptedException {
        WebDriver driver = getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver instance is null. Please initialize the driver first.");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 2. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
    }

    public static void scrollPageThree() throws InterruptedException {
        WebDriver driver = getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver instance is null. Please initialize the driver first.");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 2. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 3. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
    }


    public static void scrollPageFour() throws InterruptedException {
        WebDriver driver = getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver instance is null. Please initialize the driver first.");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 2. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 3. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 4. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
    }

    public static void scrollPageFive() throws InterruptedException {
        WebDriver driver = getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver instance is null. Please initialize the driver first.");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 2. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 3. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);

        // 4. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
        // 4. Scroll
        js.executeScript("window.scrollBy(0, 500);");
        sleep(1000);
    }
    public static void scrollToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void verifyNewTabUrlIs() {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);

        Driver.getDriver().switchTo().window(windowList.get(1));

        // (Optional) you can go back to the first tab:
        // Driver.getDriver().switchTo().window(windowList.get(0));
    }

    public static void scrollUpOne(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -500);");
        sleep(1);
    }

    public static void closeCurrentTabAndSwitchBack() {
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);

        if (windowList.size() > 1) {
            Driver.getDriver().close();

            Driver.getDriver().switchTo().window(windowList.get(0));
        } else {
            System.out.println("Kapatılacak ekstra bir sekme yok.");
        }
    }

    public static boolean isFileDownloaded(String fileName) {
        String homePath = System.getProperty("user.home");
        String downloadPath = homePath + "/Downloads/";
        File file = new File(downloadPath + fileName);
        return file.exists();
    }
}
