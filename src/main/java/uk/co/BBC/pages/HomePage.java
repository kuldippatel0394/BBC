package uk.co.BBC.pages;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.BBC.utility.Utility;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='ssrcss-myaq3t-Options exhqgzu4']/p/button")
    WebElement acceptcookie;

    @CacheLookup
    @FindBy(xpath = "//div[@class='ssrcss-viqt7x-HeaderStack e1k195vp3']/div/header//div/div[2]/ul[2]/li/a")
    List<WebElement> Maintab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='ssrcss-181c4hk-SectionWrapper eustbbg0']/div/div/div//div/nav/div/div/div/div/div[2]/ul/li/a")
    List<WebElement> Subtab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='sp-c-sport-navigation sp-c-sport-navigation--secondary qa-secondary']/div/ul/li//a[contains(text(),'Cricket')]")
    WebElement crickettext;

    @CacheLookup
    @FindBy(xpath = "//div[@class='ssrcss-fr8ebb-GlobalNavigationItem e1gviwgp23']/ul/li//a[@class='ssrcss-13ox91y-NavigationLink-AccountLink e1gviwgp13']")
    WebElement signin;

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement Username;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement SigninButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='gs-c-promo-body gel-1/3@m gs-u-mt@xs gs-u-mt0@m gs-u-pl0 gs-u-pl@m']/div/a")
    WebElement article;

    @CacheLookup
    @FindBy(xpath = "//p[@class='story-info gel-brevier gs-u-pb+ gs-u-mb-alt+ gs-u-mv+ gs-u-display-flex']/span[3]/span")
    WebElement icon;


    public void Acceptcookie() throws InterruptedException {
        clickOnElement(acceptcookie);
        Thread.sleep(2000);
        log.info("Click on accept cookie button :" + acceptcookie.toString());
    }

    public void ClickonSignin() {
        clickOnElement(signin);
        log.info("Click on sign in button" + signin.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(Username, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(Password, password);
    }

    public void ClickonLoginbutton() {
        clickOnElement(SigninButton);
    }


    public void Mainmenu(String maintab) {
        log.info("Click on any of the categories from the top list e.g Sport,Weather etc :" + Maintab.toString());
        for (WebElement a : Maintab) {
            if (a.getText().equalsIgnoreCase(maintab)) {
                a.click();
                break;
            }
        }
    }

    public void Submenu(String subtab) {
        log.info("Click on any of the categories from selected list from above categories :" + Subtab.toString());
        for (WebElement b : Subtab) {
            if (b.getText().equalsIgnoreCase(subtab)) {
                b.click();
                break;
            }
        }
    }

    public void sportarticle() {
        clickOnElement(article);
    }


    public void icon() {
        verifyThatElementIsDisplayed(icon);
    }
}




