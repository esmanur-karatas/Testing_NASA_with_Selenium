package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Tabbar_New_And_Events_Page {
    public Tabbar_New_And_Events_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='News & Events'])[1]")
    private WebElement newAndEventsButton;

    @FindBy(xpath = "(//h3[text()='News & Events'])")
    private WebElement newAndEventsText;

    @FindBy(xpath = "(//span[text()='Video Series on NASA+'])[1]")
    private WebElement videoSeriesOnNASAButton;

    @FindBy(xpath = "(//span[text()='Newsletters'])[1]")
    private WebElement newslettersButton;

    public void clickNewAndEventsButton() {
        newAndEventsButton.click();
    }

    public void clickNewAndEventsText() {
        newAndEventsText.click();
    }

    public void clickVideoSeriesOnNASAButton() {
        videoSeriesOnNASAButton.click();
    }

    public void clickNewslettersButton() {
        newslettersButton.click();
    }


}
