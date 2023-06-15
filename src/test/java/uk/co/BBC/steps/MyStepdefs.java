package uk.co.BBC.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.codec.digest.HmacUtils;
import uk.co.BBC.pages.HomePage;

public class MyStepdefs {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User to accept cookie$")
    public void userToAcceptCookie() throws InterruptedException {
        new HomePage().Acceptcookie();
    }
    @And("^user to click on sign in$")
    public void userToClickOnSignIn() {
        new HomePage().ClickonSignin();
    }
    @And("^user to enter email address on email address field \"([^\"]*)\"$")
    public void userToEnterEmailAddressOnEmailAddressField(String emailaddress)  {
    new HomePage().enterEmail(emailaddress);
    }
    @And("^user to enter password on password field \"([^\"]*)\"$")
    public void userToEnterPasswordOnPasswordField(String password){
        new HomePage().enterPassword(password);
    }

    @Then("^user to click on sign in button$")
    public void userToClickOnSignInButton() {
        new HomePage().ClickonLoginbutton();
    }


    @And("^user to navigate to any of the categories from main menu$")
    public void userToNavigateToAnyOfTheCategoriesFromMainMenu() {
        new HomePage().Mainmenu("Sport");
    }

    @And("^User to navigate to different page from selected page$")
    public void userToNavigateToDifferentPageFromSelectedPage() {
        new HomePage().Submenu("Cricket");
    }

    @And("^User to click on article with comment function$")
    public void userToClickOnArticleWithCommentFunction() {
        new HomePage().sportarticle();
    }
    @Then("^User to verify comment is enabled or not$")
    public void userToVerifyCommentIsEnabledOrNot() {
        new HomePage().icon();
    }

}
