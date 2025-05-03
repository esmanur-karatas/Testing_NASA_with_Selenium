package negative_Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Tabbar_Explore_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nasa_404_Error_And_Home_Redirect_Test  {
    String url = ConfigurationReader.getProperty("falseUrl");
    Tabbar_Explore_Page tabbar_explore_page;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(url);
        tabbar_explore_page = new Tabbar_Explore_Page();
    }

    @Test
    public void Nasa_404_Error_And_Home_Redirect_Test() {
//        1.	Check if a "404" error page is displayed when the user tries to access an invalid URL, such as nasa.gov/abcxyz.
//        2.	Click on the NASA logo and go to the homepage.
        tabbar_explore_page.clickNasaLogo();

//        3.	Once on the homepage, check if the URL is compatible with https://www.nasa.gov/.
        String expectedUrl = "https://www.nasa.gov/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
