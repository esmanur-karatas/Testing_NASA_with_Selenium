package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class News_Releases_Form_Page {
    public News_Releases_Form_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(className = "button_link")
    private WebElement subscribeButton;

    @FindBy(xpath = "//td/table[3]/tbody/tr/td")
    private WebElement message;

    public void inputEmail(String EmailText) {
        email.sendKeys(EmailText);
    }

    public void inputFirstName(String FirstNameText) {
        firstName.sendKeys(FirstNameText);
    }

    public void inputLastName(String LastNameText) {
        lastName.sendKeys(LastNameText);
    }

    public void clickSubscribeButton() {
        subscribeButton.click();
    }

    public void verifyMessage(String expectedMessage){
        String expectedText = expectedMessage;
        String actualText = message.getText();

        Assert.assertEquals(actualText,expectedText);
    }

}
