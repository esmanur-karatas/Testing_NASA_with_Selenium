package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Tabbar_Explore_Page {

    public Tabbar_Explore_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Explore']")
    private WebElement exploreButton;

    @FindBy(xpath = "(//span[text()='Missions'])[1]")
    private WebElement missionsButton;

    @FindBy (xpath = "//h3[text()='Missions']")
    private WebElement missionText;

    @FindBy(id="header-logo")
    private WebElement nasaLogo;

    @FindBy(xpath = "//*[@id=\"global-navigation\"]/div/div/div[1]/div/ul/li[3]/a/span")
    private WebElement humansinSpaceButton;

    @FindBy(xpath = "//*[@id=\"global-navigation\"]/div/div/div[3]/div/div[3]/ul/li[2]/a")
    private WebElement astronautsButton;

    public void clickExploreButton() {
        exploreButton.click();
    }

    public void clickMissonsButton(){
        missionsButton.click();
    }

    public void clickNasaLogo(){
        nasaLogo.click();
    }
    public void verifyMissionText(String verifyText){
        String expectedText = verifyText;
        String actualText = missionText.getText();

        Assert.assertEquals(actualText,expectedText);
    }

    public void clickMissionText(){
        missionText.click();
    }

    public void verifyNasaLogo(){
        Assert.assertTrue(nasaLogo.isDisplayed());
    }

    public void clickHumansinSpaceButton(){
        humansinSpaceButton.click();
    }

    public void clickAstronautsButton(){
        astronautsButton.click();
    }
}
