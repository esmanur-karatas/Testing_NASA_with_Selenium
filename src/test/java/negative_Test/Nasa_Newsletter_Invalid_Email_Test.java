package negative_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Newsletters_Page;
import page.Subscribe_Form_Page;
import page.Tabbar_New_And_Events_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Nasa_Newsletter_Invalid_Email_Test {
    Tabbar_New_And_Events_Page tabbar_new_and_events_page;
    Newsletters_Page newsletters_page;
    Subscribe_Form_Page subscribe_form_page;
    String url = ConfigurationReader.getProperty("address");

    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(url);
        tabbar_new_and_events_page = new Tabbar_New_And_Events_Page();
        newsletters_page = new Newsletters_Page();
        subscribe_form_page = new Subscribe_Form_Page();

    }

    @Test
    public void Nasa_Newsletter_Invalid_Email_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the homepage has loaded, click on "News & Events" in the top menu.
        tabbar_new_and_events_page.clickNewAndEventsButton();

//        3.	On the page that opens, click on the "Newsletters" heading.
        tabbar_new_and_events_page.clickNewslettersButton();

//        4.	Scroll until "Sign Up" appears on the page that opens.
        ReusableMethods.scrollPageTwice();

//        5.	Click Sign Up.
        newsletters_page.clickSignUpLink();

//        6.	In the email that opens, type "test@.com".
        subscribe_form_page.inputEmail("test@.com");

//        7.	Click the Subscribe button.
        subscribe_form_page.clickSubscribeButton();

//        8.	Check if the warning message "Please enter your email address in name@email.com format." appears in the email.
        ReusableMethods.sleep(6000);
        subscribe_form_page.verifyEmailErrorMessageText("Please enter your email address in name@email.com format.");

    }

    @AfterMethod
    public void TearnDown() {
        Driver.closeDriver();
    }
}
