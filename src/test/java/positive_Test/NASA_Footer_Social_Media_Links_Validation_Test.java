package positive_Test;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class NASA_Footer_Social_Media_Links_Validation_Test extends Base_Test {
    String facebookUrl = ConfigurationReader.getProperty("facebookUrl");
    String instagramUrl = ConfigurationReader.getProperty("instagramUrl");
    String xUrl = ConfigurationReader.getProperty("xUrl");
    String youtubeUrl = ConfigurationReader.getProperty("youtubeUrl");


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
        ReusableMethods.verifyNewTabUrlIs(facebookUrl);

//        5.	Close the tab.
//        6.	Go back to the previous tab.
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        7.	Go to the bottom of the page. Click on the Instagram icon
        ReusableMethods.scrollToFooter();
        footer_page.clickInstagramIcon();

//        8.	On the page that opens, verify that the url is "https://www.instagram.com/nasa/".
        ReusableMethods.verifyNewTabUrlIs(instagramUrl);

//        9.	Close the tab.
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        10.	Click the X icon, verify that the url is "https://x.com/NASA" on the page that opens and close the tab.
        ReusableMethods.scrollToFooter();
        footer_page.clickXIcon();
        ReusableMethods.verifyNewTabUrlIs(xUrl);
        ReusableMethods.closeCurrentTabAndSwitchBack();

//        11.	Click the Youtube icon. on the page that opens, verify that the url is "https://www.youtube.com/@NASA" and close the tab.
        ReusableMethods.scrollPageTwice();
        footer_page.clickYoutubeIcon();
        ReusableMethods.verifyNewTabUrlIs(youtubeUrl);
        ReusableMethods.closeCurrentTabAndSwitchBack();


    }
}
