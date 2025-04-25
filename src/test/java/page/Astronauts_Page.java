package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Astronauts_Page {
    public Astronauts_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h3[text()='Anne McClain'])[1]")
    private WebElement astrounautsText;

    @FindBy(xpath = "//h2[text()='Summary']")
    private WebElement summaryText;

    @FindBy(className = "dp-migrated-file")
    private WebElement pdfDownload;

    @FindBy(xpath = "//*[@id='post-278280']/div/div[5]/div/div/div[1]/a/span")
    private WebElement biographyButton;

    public void clickAstrounautsText(){
        astrounautsText.click();
    }

    public void verifySummaryText(String text){
        String expectedText = text;
        String actualText = summaryText.getText();

        Assert.assertEquals(actualText, expectedText);

    }

    public void clickPdfDownload(){
        pdfDownload.click();
    }

    public void clickBiographyButton(){
        biographyButton.click();
    }
}
