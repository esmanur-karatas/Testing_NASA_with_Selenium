package positive_Test;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class Content_Access_and_Video_Verification_Test_with_Moon_Search extends Base_Test {
    @Test
    public void content_Access_and_Video_Verification_Test_with_Moon_Search() throws InterruptedException {
//        1.	Go to https://www.nasa.gov/
//        2.	Type the word "Moon" in the search box at the top right of the home page and press Enter
        search_page.inputSerachBox("Moon");

//        3.	On the page that opens, check if "Search Results for: Moon" appears on the page.
        search_page.verifySearchResultTitle("Search Results for: Moon");

//        4.	Check if the first search result that comes up has the word "Moon" in it.
        search_page.VerifyContainsSearchedWord("Moon");

//        5.	Click on the first search result.
        search_page.clickContainsSearchedWord();

//        6.	On the page that opens, scroll down and keep scrolling until a video appears on the page.
        ReusableMethods.scrollPageThree();
        moon_page.clickPlayVideoButton();

//        7.	Check if it works by clicking on the video that appears.
        moon_page.isYouTubeVideoPlaying();
        ReusableMethods.sleep(6000);
        boolean isPlaying = moon_page.isYouTubeVideoPlaying();
        System.out.println("Is the video currently playing? " + isPlaying);

//        8.	Stop or close the video by clicking again.
        moon_page.clickPauseVideoButton();

    }
}
