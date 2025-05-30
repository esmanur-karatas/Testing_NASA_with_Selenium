package positive_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Footer_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NASA_Footer_Social_Media_Links_Validation_Test {
    Footer_Page footer_page;

    String facebookUrl = ConfigurationReader.getProperty("facebookUrl");
    String instagramUrl = ConfigurationReader.getProperty("instagramUrl");
    String xUrl = ConfigurationReader.getProperty("xUrl");
    String youtubeUrl = ConfigurationReader.getProperty("youtubeUrl");


    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        footer_page = new Footer_Page();
    }

    @Test
    public void NASA_Footer_Social_Media_Links_Validation_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Go to the bottom of the page.
        ReusableMethods.scrollToFooter();

//        3.	Click on the facebook icon in the footer.
        ReusableMethods.sleep(6000);
        footer_page.clickFacebookIcon();

//        4. On the page that opens, verify that the url says "https://www.facebook.com/NASA”.
        ReusableMethods.sleep(6000);
        ReusableMethods.verifyNewTabUrlIs();
        String expectedUrl = facebookUrl;
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

//        5.	Close the tab.
//        6.	Go back to the previous tab.
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        7.	Go to the bottom of the page. Click on the Instagram icon
        ReusableMethods.scrollToFooter();
        footer_page.clickInstagramIcon();

//        8.	On the page that opens, verify that the url is "https://www.instagram.com/nasa/".
        ReusableMethods.verifyNewTabUrlIs();
        String expectedInstagramUrl = instagramUrl;
        String actualInstagramUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualInstagramUrl, expectedInstagramUrl);

//        9.	Close the tab.
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        10.	Click the X icon, verify that the url is "https://x.com/NASA" on the page that opens and close the tab.
        ReusableMethods.scrollToFooter();
        footer_page.clickXIcon();
        ReusableMethods.verifyNewTabUrlIs();
        String expectedXUrl = xUrl;
        String actualXUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualXUrl, expectedXUrl);
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        11.	Click the Youtube icon. on the page that opens, verify that the url is "https://www.youtube.com/@NASA" and close the tab.
        ReusableMethods.scrollPageTwice();
        footer_page.clickYoutubeIcon();
        ReusableMethods.verifyNewTabUrlIs();
        String expectedYoutubeUrl = youtubeUrl;
        String actualYoutubeUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualYoutubeUrl, expectedYoutubeUrl);
        ReusableMethods.closeCurrentTabAndSwitchBack();
    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
