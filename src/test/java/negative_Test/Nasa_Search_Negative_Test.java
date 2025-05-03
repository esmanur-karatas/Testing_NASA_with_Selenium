package negative_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Search_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nasa_Search_Negative_Test {
    Search_Page search_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(url);
        search_page = new Search_Page();
    }

    @Test
    public void Nasa_Search_Negative_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Search the search box on the homepage with nothing typed in and see if the text "Sorry"

        search_page.inputSerachBox(" ");
        
        String expectedText = "Sorry".toLowerCase();
        String actualText = search_page.verifyErrorMessage().getText().toLowerCase();

        Assert.assertTrue(actualText.contains(expectedText),
                "Expected to find '" + expectedText + "' in the text, but got: " + actualText);
    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
