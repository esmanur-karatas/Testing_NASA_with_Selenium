package negative_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Search_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nasa_Search_Special_Char_Test {
    Search_Page search_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        search_page = new Search_Page();
    }

    @Test
    public void Nasa_Search_Special_Char_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Enter a long 300+ character meaningless text like "asdqwezxc..." in the search box.
//        3.	Press Enter.
        search_page.inputSerachBox("oerıfjop9ew43ıf0ü9w34ıdcfpwe4ı0cfp0ew4ıf0ocpoerıfjop9ew43ıf0ü9w34ıdcfpwe4ı0cfp0ew4ıf0ocpoerıfjop9ew4");
//        4.	Check if the page shows the message "Too Many Special Characters".
        String expectedMessage = "Too Many Special Characters";
        String actualMessage = search_page.verifyTooManyErrorMessage().getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
