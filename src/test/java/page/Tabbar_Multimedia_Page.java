package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Tabbar_Multimedia_Page {
    public Tabbar_Multimedia_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Multimedia'])[1]")
    private WebElement multimediaButton;

    @FindBy(xpath = "(//span[text()='e-Books'])[1]")
    private WebElement eBookButton;

    @FindBy(xpath = "//*[@id='news-galleries-submenu']/li[2]/a/span")
    private WebElement imagesButton;

    public void clickMultimediaButton() {
        multimediaButton.click();
    }

    public void clickEBookButton() {
        eBookButton.click();
    }

    public void clickImagesButton(){
        imagesButton.click();
    }
}
