package positive_Test;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class NASA_eBook_Download_Test extends Base_Test {
    @Test
    public void NASA_eBook_Download_Test() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Once the home page has loaded, click on "Multimedia" in the top menu.
        tabbar_multimedia_page.clickMultimediaButton();

//        3.	Click on the "E-books" link in the drop-down menu.
        tabbar_multimedia_page.clickEBookButton();

//        4.	Verify that the title "NASA e-Books" appears on the page that opens.
        eBooks_page.verifyTitleText("NASA e-Books");

//        5.	Scroll until the book title "Archaeology, Anthropology, and Interstellar Communication" appears.
        ReusableMethods.scrollPageTwice();

//        6.	Click on the "Overview" button.
        eBooks_page.clickSelectEBook();

//        7.	Scroll until "E-pub format" on the page that opens.
        ReusableMethods.scrollPageTwice();

//        8.	Then click on the arrow button.
        eBooks_page.clickEPubDownload();

//        9.	Check whether the Book has come down in the downloaded ones.
        ReusableMethods.isFileDownloaded("sp-4413-epub.epub");
    }
}
