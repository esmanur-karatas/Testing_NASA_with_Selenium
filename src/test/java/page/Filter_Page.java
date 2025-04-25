package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Filter_Page {
    public Filter_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "content_typearticles")
    private WebElement contentTypeArticles;

    @FindBy(id = "marsmars")
    private WebElement categoriesMars;

    @FindBy(id = "last-yearlast-year")
    private WebElement changedLastYear;

    @FindBy(id = "languageenglish")
    private WebElement languageEnglish;

    @FindBy(xpath = "//*[@id='primary']/div/div[2]/div/div[1]/div[2]/button/span[1]")
    private WebElement applyFilterButton;

    @FindBy(xpath = "(//span[@class='filter-label'])[2]")
    private WebElement arcticleIsDisplayed;

    @FindBy(xpath = "(//span[@class='filter-label'])[3]")
    private WebElement categoriesIsDisplayed;

    @FindBy(xpath = "(//span[@class='filter-label'])[4]")
    private WebElement clearFilterButton;

    @FindBy(id = "content_typegallery")
    private WebElement contentTypeGallery;

    @FindBy(id = "iss-researchiss-research")
    private WebElement categoriesIssResearchiss;

    @FindBy(id = "languageespanol")
    private WebElement languageEspanol;

    @FindBy(className = "hds-notice")
    private WebElement errorMessageText;

    public void clickContentTypeArticles() {
        contentTypeArticles.click();
    }

    public void clickCategoriesMars() {
        categoriesMars.click();
    }

    public void clickChangedLasYear() {
        changedLastYear.click();
    }

    public void clickLanguageEnglish() {
        languageEnglish.click();
    }

    public void clickApplyFilterButton() {
        applyFilterButton.click();
    }

    public void verifyArticlesFilter() {
        Assert.assertTrue(arcticleIsDisplayed.isDisplayed());
    }

    public void verifyCategoriesFilter() {
        Assert.assertTrue(categoriesIsDisplayed.isDisplayed());
    }

    public void clickClearFilterButton() {
        clearFilterButton.click();
    }

    public void clickContentTypeGallery() {
        contentTypeGallery.click();
    }

    public void clickCategoriesIssResearchiss() {
        categoriesIssResearchiss.click();
    }

    public void clickLanguageEspanol() {
        languageEspanol.click();
    }

    public void verifyErrorMessageText(String errorMessage) {
        String extendMessage = errorMessage;
        String actualMessage = errorMessageText.getText();

        Assert.assertEquals(actualMessage, extendMessage);
    }
}
