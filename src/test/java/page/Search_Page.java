package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Search_Page {
    public Search_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "search-field-en-small--desktop")
    private WebElement searchBox;

    @FindBy(className = "heading-28")
    private WebElement searchResultTitle;

    @FindBy(xpath = "//div[@class='grid-col-auto']")
    private WebElement containsSearchedWord;

    @FindBy(xpath = "//div/div[2]/p[2]")
    private WebElement errorMessage;

    @FindBy(className = "wp-die-message")
    private WebElement tooManyErrorMessage;

    public void inputSerachBox(String searchText) {
        searchBox.sendKeys(searchText, Keys.ENTER);
    }

    public void verifySearchResultTitle(String resultText) {
        String expectedTitle = resultText;
        String actualTitle = searchResultTitle.getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void VerifyContainsSearchedWord(String searchWord) {
        String expectedText = searchWord.toLowerCase();
        String actualText = containsSearchedWord.getText().toLowerCase();

        Assert.assertTrue(actualText.contains(expectedText),
                "Expected to find '" + expectedText + "' in the text, but got: " + actualText);
    }

    public void clickContainsSearchedWord() {
        containsSearchedWord.click();
    }

    public void verifyErrorMessage(String errorMessageText) {
        String expectedText = errorMessageText.toLowerCase();
        String actualText = errorMessage.getText().toLowerCase();

        Assert.assertTrue(actualText.contains(expectedText),
                "Expected to find '" + expectedText + "' in the text, but got: " + actualText);
    }

    public void verifyTooManyErrorMessage(String message) {
        String expectedMessage = message;
        String actualMessage = tooManyErrorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
