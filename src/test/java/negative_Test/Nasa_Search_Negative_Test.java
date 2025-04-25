package negative_Test;

import org.testng.annotations.Test;

public class Nasa_Search_Negative_Test extends Base_Test {
    @Test
    public void Nasa_Search_Negative_Test() {
//        1.	Go to https://www.nasa.gov/
//        2.	Search the search box on the homepage with nothing typed in and see if the text "Sorry"

        search_page.inputSerachBox(" ");
        search_page.verifyErrorMessage("Sorry");
    }
}
