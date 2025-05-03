package positive_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Astronauts_Page;
import page.Tabbar_Explore_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NASA_Astronaut_Profile_and_PDF_Download_Test {
    Tabbar_Explore_Page tabbar_explore_page;
    Astronauts_Page astronauts_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        tabbar_explore_page = new Tabbar_Explore_Page();
        astronauts_page = new Astronauts_Page();
    }

    @Test
    public void NASA_Astronaut_Profile_and_PDF_Download_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on "Explore" in the top menu.
        tabbar_explore_page.clickExploreButton();

//        3.	Click on the "Humans in Space" link in the drop-down menu.
        tabbar_explore_page.clickHumansinSpaceButton();

//        4.	Click on "Astronauts" in the drop-down menu.
        tabbar_explore_page.clickAstronautsButton();

//        5.	Once the page is fully loaded, select an astronaut profile (Don Petit).
        astronauts_page.clickAstrounautsText();

//        6.	Scroll down the page until " View Donald Pettit Biographyabout Donald Pettit " appears and click on it.
        ReusableMethods.scrollPageFour();
        astronauts_page.clickBiographyButton();

//        7.	Verify the "Summary" heading on the page that opens.
        String expectedText = "Summary";
        String actualText = astronauts_page.verifySummaryText().getText();

        Assert.assertEquals(actualText, expectedText);

//        8.	Scroll to the bottom of the page.
        ReusableMethods.scrollToFooter();
        ReusableMethods.sleep(6000);

//        9.	Click on the link "Wiseman, G. Reid (PDF 388 KB)"
        astronauts_page.clickPdfDownload();

        ReusableMethods.sleep(10000);

//        10.	Check whether it has landed in your Downloads folder
        ReusableMethods.isFileDownloaded("mcclain-ac.pdf");
    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
