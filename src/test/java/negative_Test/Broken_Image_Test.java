package negative_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class Broken_Image_Test {
    WebDriver driver;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void setUp() {
//        2.	Disable image loading in your browser settings.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--blink-settings=imagesEnabled=false"); // görseller yüklenmesin

        driver = Driver.getDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1.	Go to https://www.nasa.gov/.
        driver.get(url);
    }

    @Test
    public void Broken_Image_Test() {
//        3.	Navigate through various pages of the NASA website (homepage, news, missions, etc.).
//        4.	Verify that broken image icons or placeholders are displayed instead of actual images.
//        5.	Check if the "alt" text for each image is descriptive and provides context about the missing image.
        System.out.println("hecking the images on the NASA website.");

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of img tags: " + images.size());

        for (WebElement image : images) {
            String src = image.getAttribute("src");
            String alt = image.getAttribute("alt");

            if (src == null || src.isEmpty()) {
                System.out.println("❌Corrupted image found (src empty)");
            }

            if (alt == null || alt.isEmpty()) {
                System.out.println("⚠️  Missing ALT text -> src: " + src);
            } else {
                System.out.println("✅ ALT text: " + alt);
            }
        }
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
