package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Series_Page {
    public Series_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "page-title")
    private WebElement exploreSeriesTitle;

    @FindBy(xpath = "//h4[text()='Our Alien Earth']")
    private WebElement ourAlienEarthTitle;

    public void verifyExploreSeriesTitle() {
        Assert.assertTrue(exploreSeriesTitle.isDisplayed());
    }

    public void clickOurAlienEarthTitle() {
        ourAlienEarthTitle.click();
    }
}
