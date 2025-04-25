package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.URL;

import static utilities.ReusableMethods.isFileDownloaded;

public class EBooks_Page {
    public EBooks_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "heading-41")
    private WebElement titleText;

    @FindBy(xpath = "(//span[text()='Overview'])[2]")
    private WebElement selectEBook;

    @FindBy(xpath = "//div[3]/div/div[3]/div/div[3]/a")
    private WebElement ePubDownload;

    public void verifyTitleText(String title) {
        String expectedTitle = title;
        String actualTitle = titleText.getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void clickSelectEBook() {
        selectEBook.click();
    }

    public void clickEPubDownload() throws InterruptedException {
        ePubDownload.click();
    }
}
