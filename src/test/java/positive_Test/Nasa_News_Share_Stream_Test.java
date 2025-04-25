package positive_Test;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class Nasa_News_Share_Stream_Test extends Base_Test {

    @Test
    public void nasa_News_Share_Stream_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on "News & Events" in the top menu.
        tabbar_new_and_events_page.clickNewAndEventsButton();

//        3.	Click on the "News & Events" link in the drop-down menu.
        tabbar_new_and_events_page.clickNewAndEventsText();

//        4.	Verify the "News Releases" heading on the page that opens.
        news_page.verifyNewsReleasesTitle();

//        5.	Click on the first news item.
        ReusableMethods.scrollPageTwice();
        ReusableMethods.sleep(6000);
        news_page.clickFirstNews();

//        6.	When the news page opens, check for images or videos.
        news_page.isFirstImageVisible();

//        7.	Click on Linkdln from the sharing buttons on the left side of the page and verify the sharing screen.
        news_page.clickLinkdlnButton();

    }
}
