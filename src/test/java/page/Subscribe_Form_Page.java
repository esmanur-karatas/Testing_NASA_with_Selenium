package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Subscribe_Form_Page {
    public Subscribe_Form_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@data-qe-id='form-button']" )
    private WebElement subscribeButton;

    @FindBy(xpath = "(//div[@class='ctct-form-errorMessage'])[1]")
    private WebElement emailErrorMessageText;

    @FindBy(id = "email_address_0")
    private WebElement email;

    public void clickSubscribeButton(){
        subscribeButton.click();
    }

    public void inputEmail(String mailText){
        email.sendKeys(mailText, Keys.ENTER);
    }

    public void verifyEmailErrorMessageText(String errorText){
        String expectedMessage = errorText;
        String actualMessage = emailErrorMessageText.getText();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
