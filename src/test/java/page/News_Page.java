package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class News_Page {
    public News_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "section-heading-md")
    private WebElement newsReleasesTitle;

    @FindBy(xpath = "//div[2]/div/div[1]/a/div/div")
    private WebElement firstNews;

    @FindBy(xpath = "//img[@block_context='nasa-block']\n")
    private List<WebElement> images;

    @FindBy(xpath = "//div[2]/div[1]/div[5]/ul/li[3]/a")
    private WebElement linkdlnButton;

    @FindBy(xpath = "//a[@rel='noopener']")
    private WebElement signUpButton;

    public void verifyNewsReleasesTitle() {
        String expectedTitle = "News Releases";
        String actualTitle = newsReleasesTitle.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void clickFirstNews() {
        firstNews.click();
    }

    public boolean isFirstImageVisible() {
        return images.get(0).isDisplayed();
    }

    public void clickLinkdlnButton() {
        linkdlnButton.click();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
}
