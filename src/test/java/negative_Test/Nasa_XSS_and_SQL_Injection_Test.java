package negative_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Search_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nasa_XSS_and_SQL_Injection_Test {
    Search_Page search_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        search_page = new Search_Page();
    }

    @Test
    public void Nasa_XSS_and_SQL_Injection_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Enter an XSS (Cross-Site Scripting) attack code like
//        < script> alert('XSS')</script> in the search box at the top right of the page and press Enter.
        search_page.inputSerachBox("<script> alert('XSS')</script>");

//        3.	Verify that this code is not executed on the search results page
//        (e.g. no warning box appears) and is displayed as text as is.
        String expectedTitle = "Search Results for: alert(\\'XSS\\')";
        String actualTitle = search_page.verifySearchResultTitle().getText();
        Assert.assertEquals(actualTitle, expectedTitle);

//        4.	In the search box on the search results page,
//        enter a potential SQL injection phrase such as 'sql injection attempt' and press Enter.
        search_page.inputSerachBox("sql injection attempt");

//        5.	Verify that the website responds to such input without error and that it
//        does not cause an unexpected database error or security vulnerability.
        search_page.inputSerachBox("Search Results for: sql injection attempt");

    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
