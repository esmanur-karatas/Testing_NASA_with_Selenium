package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Moon_Page {

    public Moon_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@title='Oynat']")
    private WebElement playVideoButton;

    @FindBy(id = "RROlja1ob_4")
    private WebElement iframeElement;

    @FindBy(xpath = "//button[@aria-keyshortcuts='k']")
    private WebElement pauseVideoButton;

    public void clickPlayVideoButton(){
        Driver.getDriver().switchTo().frame(iframeElement);
        playVideoButton.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    // Method to check if a YouTube video is playing
    public boolean isYouTubeVideoPlaying() {
        Driver.getDriver().switchTo().frame(iframeElement);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Long playerState = (Long) js.executeScript(
                "return document.querySelector('video').paused ? 2 : 1;");

        Driver.getDriver().switchTo().defaultContent();

        return playerState == 1;
    }

    public void clickPauseVideoButton(){
        Driver.getDriver().switchTo().frame(iframeElement);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("document.querySelector('video').pause();");

        Driver.getDriver().switchTo().defaultContent();
    }
}