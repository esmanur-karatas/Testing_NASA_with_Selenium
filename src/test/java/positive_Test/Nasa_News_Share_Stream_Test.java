package positive_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.News_Page;
import page.Tabbar_New_And_Events_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Nasa_News_Share_Stream_Test {
    Tabbar_New_And_Events_Page tabbar_new_and_events_page;
    News_Page news_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        news_page = new News_Page();
        tabbar_new_and_events_page = new Tabbar_New_And_Events_Page();
    }

    @Test
    public void nasa_News_Share_Stream_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on "News & Events" in the top menu.
        tabbar_new_and_events_page.clickNewAndEventsButton();

//        3.	Click on the "News & Events" link in the drop-down menu.
        tabbar_new_and_events_page.clickNewAndEventsText();

//        4.	Verify the "News Releases" heading on the page that opens.
        String expectedTitle = "News Releases";
        String actualTitle = news_page.verifyNewsReleasesTitle().getText();
        Assert.assertEquals(actualTitle, expectedTitle);

//        5.	Click on the first news item.
        ReusableMethods.scrollPageTwice();
        ReusableMethods.sleep(6000);
        news_page.clickFirstNews();

//        6.	When the news page opens, check for images or videos.
        news_page.isFirstImageVisible();

    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
