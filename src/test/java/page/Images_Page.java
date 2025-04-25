package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Images_Page {
    public Images_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"post-336989\"]/div/div[6]/div[1]/div/div[2]/a/span")
    private WebElement goToGalleryButton;

    @FindBy(xpath = "//*[@id=\"post-842456\"]/section/div/div[3]/div/div[1]/a/img")
    private WebElement firstImage;

    @FindBy(xpath = "//*[@id=\"post-842457\"]/section/div/div/div[2]/div[2]/a/span")
    private WebElement downloadButton;

    @FindBy(xpath = "//*[@id=\"social-share-button\"]/span")
    private WebElement shareButton;

    public void clickGoToGallery(){
        goToGalleryButton.click();
    }

    public void clickFirstImage(){
        firstImage.click();
    }

    public void verifyDownloadButton(){
        Assert.assertTrue(downloadButton.isDisplayed());
    }

    public void verifyShareButton(){
        Assert.assertTrue(shareButton.isDisplayed());
    }
}
