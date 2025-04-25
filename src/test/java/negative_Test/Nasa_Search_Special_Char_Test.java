package negative_Test;

import org.testng.annotations.Test;

public class Nasa_Search_Special_Char_Test extends Base_Test {
    @Test
    public void Nasa_Search_Special_Char_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Enter a long 300+ character meaningless text like "asdqwezxc..." in the search box.
//        3.	Press Enter.
        search_page.inputSerachBox("oerıfjop9ew43ıf0ü9w34ıdcfpwe4ı0cfp0ew4ıf0ocpoerıfjop9ew43ıf0ü9w34ıdcfpwe4ı0cfp0ew4ıf0ocpoerıfjop9ew4");
//        4.	Check if the page shows the message "Too Many Special Characters".
        search_page.verifyTooManyErrorMessage("Too Many Special Characters");

    }
}
