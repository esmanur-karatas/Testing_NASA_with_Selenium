package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Astronauts_Page {
    public Astronauts_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h3[text()='Anne McClain'])[1]")
    public WebElement astrounautsText;

    @FindBy(xpath = "//h2[text()='Summary']")
    private WebElement summaryText;

    @FindBy(className = "dp-migrated-file")
    private WebElement pdfDownload;

    @FindBy(xpath = "//*[@id='post-278280']/div/div[5]/div/div/div[1]/a/span")
    private WebElement biographyButton;

    public void clickAstrounautsText() {
        astrounautsText.click();
    }

    public WebElement verifySummaryText() {
        return summaryText;
    }

    public void clickPdfDownload() {
        pdfDownload.click();
    }

    public void clickBiographyButton() {
        biographyButton.click();
    }
}
