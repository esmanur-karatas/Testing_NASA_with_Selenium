package positive_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Tabbar_Explore_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Missions_Page_Access_Test {

    Tabbar_Explore_Page tabbar_explore_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        tabbar_explore_page = new Tabbar_Explore_Page();
    }

    @Test
    public void missions_Page_Access_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on the "Explore" button in the top right corner.
        tabbar_explore_page.clickExploreButton();

//        3.	Click on the "Missions" button in the drop-down menu.
        tabbar_explore_page.clickMissonsButton();

//        4.	When the menu opens, check if the "Missions" link is displayed in it.
        String expectedText = "Missions";
        String actualText = tabbar_explore_page.verifyMissionText().getText();
        Assert.assertEquals(actualText, expectedText);

//        5.	Click on the "Missions" link that appears.
        tabbar_explore_page.clickMissionText();

//        6.	Once the "Missions" page is loaded, check that the NASA logo is visible at the top of the page.
        Assert.assertTrue(tabbar_explore_page.verifyNasaLogo().isDisplayed());
    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
