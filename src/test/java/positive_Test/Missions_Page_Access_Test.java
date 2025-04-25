package positive_Test;

import org.testng.annotations.Test;

public class Missions_Page_Access_Test extends Base_Test {

    @Test
    public void missions_Page_Access_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on the "Explore" button in the top right corner.
        tabbar_page.clickExploreButton();

//        3.	Click on the "Missions" button in the drop-down menu.
        tabbar_page.clickMissonsButton();

//        4.	When the menu opens, check if the "Missions" link is displayed in it.
        tabbar_page.verifyMissionText("Missions");

//        5.	Click on the "Missions" link that appears.
        tabbar_page.clickMissionText();
//        6.	Once the "Missions" page is loaded, check that the NASA logo is visible at the top of the page.
        tabbar_page.verifyNasaLogo();
    }

}
