package negative_Test;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class Nasa_Newsletter_Invalid_Email_Test extends Base_Test {
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
}
