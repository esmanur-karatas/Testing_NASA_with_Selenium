package positive_Test;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class NASA_Video_Series_Access_and_Playback_Test extends Base_Test {

    @Test
    public void nasa_Video_Series_Access_and_Playback_Test() throws InterruptedException {
//            1.	Go to https://www.nasa.gov/
//            2.	Once the homepage has loaded, click on "News & Events" in the top menu.
        tabbar_new_and_events_page.clickNewAndEventsButton();

//            3.	Click on the "Video Series on Nasa+" link in the drop-down menu.
        tabbar_new_and_events_page.clickVideoSeriesOnNASAButton();

//            4.	On the page that opens, verify the title "Explore Series".
        series_page.verifyExploreSeriesTitle();

//            5.	Click on "Our Alien Earth".
        series_page.clickOurAlienEarthTitle();

//            6.	Click on the first video on the page that opens.
        series_our_alien_earth_page.clickOurAlienEarthIcelandText();

//            7.	On the page that opens, click on the "Play video" button.
        series_our_alien_earth_page.clickOurAlienEarthIcelandVideo();

//            8.	Then press the play button again on the page that opens and check if the video is playing
        ReusableMethods.sleep(6000);
        series_our_alien_earth_page.clickPlayVideo();
        ReusableMethods.sleep(6000);

    }
}