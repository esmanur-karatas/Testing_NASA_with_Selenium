package negative_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import page.*;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Base_Test {
    Tabbar_Explore_Page tabbar_explore_page;
    Tabbar_New_And_Events_Page tabbar_new_and_events_page;
    News_Page news_page;
    Series_Page series_page;
    Series_Our_Alien_Earth_Page series_our_alien_earth_page;
    Search_Page search_page;
    Moon_Page moon_page;
    Footer_Page footer_page;
    News_Releases_Form_Page news_releases_form_page;
    Newsletters_Page newsletters_page;
    Subscribe_Form_Page subscribe_form_page;
    Filter_Page filter_page;


    String url = ConfigurationReader.getProperty("address");



    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(url);
        tabbar_explore_page = new Tabbar_Explore_Page();
        tabbar_new_and_events_page = new Tabbar_New_And_Events_Page();
        news_page = new News_Page();
        series_page = new Series_Page();
        series_our_alien_earth_page = new Series_Our_Alien_Earth_Page();
        search_page = new Search_Page();
        moon_page = new Moon_Page();
        footer_page = new Footer_Page();
        news_releases_form_page = new News_Releases_Form_Page();
        newsletters_page = new Newsletters_Page();
        subscribe_form_page = new Subscribe_Form_Page();
        filter_page = new Filter_Page();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}