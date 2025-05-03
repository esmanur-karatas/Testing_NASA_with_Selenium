package negative_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Search_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nasa_Search_Special_Char_And_Invalid_Text_Test {
    Search_Page search_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        search_page = new Search_Page();
    }

    @Test
    public void Nasa_Search_Special_Char_And_Invalid_Text_Test() {
//        1. Go to https://www.nasa.gov/
//        2. Type !@#$%^&*() in the search box.
//        Verify that the message "Sorry" Verify that the message is displayed.
        search_page.inputSerachBox("!@#$%^&*()");
        String expectedText = "Sorry".toLowerCase();
        String actualText = search_page.verifyErrorMessage().getText().toLowerCase();

        Assert.assertTrue(actualText.contains(expectedText),
                "Expected to find '" + expectedText + "' in the text, but got: " + actualText);

//        3. Type "mARSSSS" in the search box.”Sorry" message is displayed.
        search_page.inputSerachBox("mARSSSS");
        String expectedText1 = "Sorry".toLowerCase();
        String actualText1 = search_page.verifyErrorMessage().getText().toLowerCase();

        Assert.assertTrue(actualText1.contains(expectedText1),
                "Expected to find '" + expectedText1 + "' in the text, but got: " + actualText1);
    }

    @AfterMethod
    public void TearnDown(){
        Driver.closeDriver();
    }
}
