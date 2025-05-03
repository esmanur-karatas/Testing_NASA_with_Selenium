package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


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

    public WebElement verifyTitleText() {
        return  titleText;
    }

    public void clickSelectEBook() {
        selectEBook.click();
    }

    public void clickEPubDownload() throws InterruptedException {
        ePubDownload.click();
    }
}
