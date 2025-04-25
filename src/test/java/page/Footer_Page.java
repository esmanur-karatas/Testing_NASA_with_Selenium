package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Footer_Page {
    public Footer_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='NASA on Facebook']")
    private WebElement facebookIcon;

    @FindBy(xpath = "//a[@title='NASA on Instagram']")
    private WebElement instagramIcon;

    @FindBy(xpath = "//a[@title='NASA on X']")
    private WebElement xIcon;

    @FindBy(xpath = "//a[@title='NASA on YouTube']")
    private WebElement youtubeIcon;


    public void clickFacebookIcon(){
        facebookIcon.click();
    }
    public void clickInstagramIcon(){
        instagramIcon.click();
    }
    public void clickXIcon(){
        xIcon.click();
    }
    public void clickYoutubeIcon(){
        youtubeIcon.click();
    }
}
