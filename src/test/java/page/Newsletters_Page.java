package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Newsletters_Page {
    public Newsletters_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@rel='noopener'])[4]")
    private WebElement signUpLink;

    public void clickSignUpLink(){
        signUpLink.click();
    }


}
