package negative_Test;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class Nasa_Mars_Search_No_Results_Test extends Base_Test {
    @Test
    public void Nasa_Mars_Search_No_Results_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Type "Mars" in the search box, press Enter.
        search_page.inputSerachBox("Mars");

//        3.	Set the filters on the left side like this:
//•	Content Type: "Gallery"
//•	Categories: "iss-researchiss-research
//•	Changed: "Last Year"
//•	Select Language: "Espanol"
        filter_page.clickContentTypeGallery();
        filter_page.clickCategoriesIssResearchiss();
        filter_page.clickChangedLasYear();
        filter_page.clickLanguageEspanol();

//        4.	Click on the "Apply Filter" button.
        ReusableMethods.scrollPageOne();
        filter_page.clickApplyFilterButton();

        ReusableMethods.sleep(6000);
//        5.	"We're working continuously to improve our search results. If you aren't finding what you expect, please use our feedback form to share the search query and expected result with us so we can improve." message.
        filter_page.verifyErrorMessageText("We're working continuously to improve our search results. If you aren't finding what you expect, please use our feedback form to share the search query and expected result with us so we can improve.");
    }
}
