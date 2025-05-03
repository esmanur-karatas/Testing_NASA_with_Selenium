package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Series_Our_Alien_Earth_Page {
    public Series_Our_Alien_Earth_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[text()='Our Alien Earth: Iceland']")
    private WebElement ourAlienEarthIcelandText;

    @FindBy(xpath = "//a[text()='Play Video']")
    private WebElement ourAlienEarthIcelandVideo;

    @FindBy(className = "vjs-big-play-button")
    private WebElement playVideo;

    public void clickOurAlienEarthIcelandText(){
        ourAlienEarthIcelandText.click();
    }

    public void clickOurAlienEarthIcelandVideo(){
        ourAlienEarthIcelandVideo.click();
    }

    public void clickPlayVideo(){
        playVideo.click();
    }
}
