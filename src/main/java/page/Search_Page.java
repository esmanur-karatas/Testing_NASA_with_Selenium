package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public WebElement verifySearchResultTitle() {
        return searchResultTitle;
    }

    public WebElement VerifyContainsSearchedWord() {
        return containsSearchedWord;
    }

    public void clickContainsSearchedWord() {
        containsSearchedWord.click();
    }

    public WebElement verifyErrorMessage() {
        return errorMessage;
    }

    public WebElement verifyTooManyErrorMessage() {
        return tooManyErrorMessage;
    }
}
