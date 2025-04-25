package negative_Test;

import org.testng.annotations.Test;

public class Nasa_Search_Special_Char_And_Invalid_Text_Test extends Base_Test {
    @Test
    public void Nasa_Search_Special_Char_And_Invalid_Text_Test() {
//        1. Go to https://www.nasa.gov/
//        2. Type !@#$%^&*() in the search box.
//        Verify that the message "Sorry" Verify that the message is displayed.
        search_page.inputSerachBox("!@#$%^&*()");
        search_page.verifyErrorMessage("Sorry");

//        3. Type "mARSSSS" in the search box.”Sorry" message is displayed.
        search_page.inputSerachBox("mARSSSS");
        search_page.verifyErrorMessage("Sorry");
    }
}
