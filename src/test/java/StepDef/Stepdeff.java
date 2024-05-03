package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import HomePage.Homepage;
import utilis.TestContextSetup;

public class Stepdeff {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Homepage homepage;

    public Stepdeff(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }



    @Given("Check homepage is available on display")
    public void checkHomepageIsAvailableOnDisplay() {
       homepage.gethomepage().isDisplayed();
    }
    @Given("Check signup is available on display")
    public void checkSignupIsAvailableOnDisplay() throws InterruptedException {
        homepage.getsignup().isDisplayed();
        Thread.sleep(3000);
    }

    @When("Click on  singup button")
    public void clickOnSingupButton() {
        homepage.getsignup().click();
    }

    @Then("Show the signup information page is available in Display")
    public void showTheSignupInformationPageIsAvailableInDisplay() {
        Assert.assertTrue(homepage.signup_page().isDisplayed());
    }


    @When("Enter Email in email field")
    public void enterEmailInEmailField() {
        homepage.geteamil().click();
        homepage.geteamil().sendKeys("kazitamim61@gmail.com");
    }

    @And("Enter name in name text field")
    public void enterNameInNameTextField() {
        homepage.getname().click();
        homepage.getname().sendKeys("Kazi Tamim");
    }

    @And("Input The Password in Password field")
    public void inputThePasswordInPasswordField() throws InterruptedException {
        homepage.getpass().click();
        homepage.getpass().sendKeys("tamim@#A12345");
        Thread.sleep(4000);
    }

    @And("Click on Continue  button")
    public void clickOnContinueButton() throws InterruptedException {
        homepage.getContinue().click();
        Thread.sleep(2000);
    }


    @Given("Check login button is available in blow")
    public void checkLoginButtonIsAvailableInBlow() {
        homepage.getlogin().isDisplayed();

    }

    @When("Click On Login button")
    public void clickOnLoginButton() throws InterruptedException {
        homepage.getlogin_p().click();
        Thread.sleep(1000);
    }

    @And("Enter Email in Email text field")
    public void enterEmailInEmailTextField() {
        homepage.get_login_email().isDisplayed();
        homepage.get_login_email().click();
        homepage.get_login_email().sendKeys("kazi15-4129@diu.edu.bd");
    }


    @And("Input The Password in Password field for log in")
    public void inputThePasswordInPasswordFieldForLogIn() throws InterruptedException {
        homepage.getpass().click();
        homepage.getpass().sendKeys("tamim12345@#A");
        Thread.sleep(1000);
    }


    @Given("Check login button is  work properly")
    public void checkLoginButtonIsWorkProperly() throws InterruptedException {
        homepage.getlogin_p().isDisplayed();
        Thread.sleep(1000);
    }
    @And("Click on Log in button")
    public void clickOnLogInButton() throws InterruptedException {
        homepage.getlogin_p().click();
        Thread.sleep(2000);

    }
    @And("Click on Log in button for main")
    public void clickOnLogInButtonForMain() throws InterruptedException {
        Thread.sleep(1000);
        homepage.getlog().click();
        Thread.sleep(1000);
    }

    @Given("Check Newsletters page properly")
    public void checkNewslettersPageProperly() {
      homepage.getnewsletters().isDisplayed();
    }

    @When("Click on Newsletters  button")
    public void clickOnNewslettersButton() {
        homepage.getnewsletters().click();
    }

    @Then("Check Email box  and Subscribe button  is available")
    public void checkEmailBoxAndSubscribeButtonIsAvailable() {
        homepage.getnews_e_box().isDisplayed();
    }

    @When("Enter mail")
    public void enterMail() {
        homepage.getnews_e_box().click();
        homepage.getnews_e_box().sendKeys("fsgsfg@gmail.com");
    }

    @And("Click Subscribe button")
    public void clickSubscribeButton() {
        homepage.getsubscribe().click();
    }

    @When("Click checkbox")
    public void clickCheckbox() {
        homepage.getpoint().click();
    }

    @Given("Check Search bar is available in display")
    public void checkSearchBarIsAvailableInDisplay()  {
        homepage.getsearch().click();
    }

    @When("Click on Search bar and Search some think")
    public void clickOnSearchBarAndSearchSomeThink() {
        homepage.getsearch().sendKeys("Today news");
    }


    @Given("Profile button is available")
    public void profileButtonIsAvailable() {
        homepage.getProfile().click();
    }

    @Then("Analytics  is available")
    public void analyticsIsAvailable() {
        homepage.getanalytics().isDisplayed();
    }

    @And("Settings  is available")
    public void settingsIsAvailable() {
        homepage.getsettings().isDisplayed();
    }

    @And("Dark mode  is available")
    public void darkModeIsAvailable() {
        homepage.getdarkmode().isDisplayed();
    }

    @And("Privacy policy  is available")
    public void privacyPolicyIsAvailable() {
        homepage.getprivacy().isDisplayed();
    }

    @And("Log out is available")
    public void logOutIsAvailable() {
        homepage.getlog_out().isDisplayed();
    }

    @Given("Check CREATE A FLIP button is available")
    public void checkCREATEAFLIPButtonIsAvailable() {
        homepage.getflip_button().isDisplayed();
    }

    @When("Click CREATE A FLIP button")
    public void clickCREATEAFLIPButtonAndSendSomeKey() {
        homepage.getflip_button().click();
    }
    @And("Click text box and send some key")
    public void clickTextBoxAndSendSomeKey() {
        homepage.getflip_box().click();
        homepage.getflip_box().sendKeys("Today news");

    }

    @Then("Check next button")
    public void checkNextButton() {
        homepage.getadd_button().isDisplayed();

    }

    @When("Click Next button")
    public void clickNextButton() {
        homepage.getadd_button().click();
    }


    @Given("Show Following  button")
    public void showFollowingButton() throws InterruptedException {
        Thread.sleep(1000);
        homepage.getfollowin_bu().isDisplayed();
    }

    @When("Click Following button")
    public void clickFollowingButton() throws InterruptedException {
        Thread.sleep(1000);
        homepage.getfollowin_bu().click();
    }

    @Then("Check All  tab is work properly")
    public void checkAllTabIsWorkProperly() throws InterruptedException {
        Thread.sleep(2000);
        homepage.gettaball().isDisplayed();
    }

    @And("Check  Videos  tab is work properly")
    public void checkVideosTabIsWorkProperly() {
        homepage.gettabvideo().isDisplayed();
    }

    @Given("Check like button is available")
    public void checkLikeButtonIsAvailable() {
      homepage.getlike().isDisplayed();
    }

    @When("Click like button")
    public void clickLikeButton() {
        homepage.getlike().click();
    }

    @Given("Check Comment  button is available")
    public void checkCommentButtonIsAvailable() {
        homepage.getcomment().isDisplayed();
    }

    @When("Click Comment  button")
    public void clickCommentButton() {
        homepage.getcomment().click();
    }

    @Then("Check text box is available")
    public void checkTextBoxIsAvailable() {
        homepage.getcommentbox().isDisplayed();
    }

    @When("Write something in  text box")
    public void writeSomethingInTextBox() {
        homepage.getcommentbox().click();
    }

    @Then("Check post button is available")
    public void checkPostButtonIsAvailable() {
        homepage.getpost().isDisplayed();
    }


    @When("Click post button")
    public void clickPostButton() {
        homepage.getpost().click();
    }

    @Given("Check NOTIFICATIONS  button is available")
    public void checkNOTIFICATIONSButtonIsAvailable() {
        homepage.getnotification().isDisplayed();
    }

    @When("Click NOTIFICATIONS   button")
    public void clickNOTIFICATIONSButton() {
        homepage.getnotification().click();
    }

    @Then("Social button  is available")
    public void socialButtonIsAvailable() {
        homepage.getSocial().isDisplayed();
    }

    @And("Content button  is available")
    public void contentButtonIsAvailable() {
        homepage.getcontent().isDisplayed();
    }

    @When("Click  Social button")
    public void clickSocialButton() {
        homepage.getSocial().click();
    }

    @And("Click  Content button")
    public void clickContentButton() {
        homepage.getcontent().click();
    }

    @Then("Close button  is available")
    public void closeButtonIsAvailable() {
        homepage.getclose().isDisplayed();
    }

    @When("Click Close button")
    public void clickCloseButton() {
        homepage.getclose().click();
    }

    @Given("Click Profile icon")
    public void clickProfileIcon() {
        homepage.getProfile().click();

    }

    @Then("Check Settings option")
    public void checkSettingsOption() {
        homepage.getsettings().isDisplayed();
    }

    @When("Click Settings option")
    public void clickSettingsOption() {
            homepage.getsettings().click();
    }

    @Then("Check Profile settings tab is available and click")
    public void checkProfileSettingsTabIsAvailableAndClick() {
        homepage.getprofile_tab().click();
    }

    @And("Check  Social Settings  tab is available and click")
    public void checkSocialSettingsTabIsAvailableAndClick() {
        homepage.getsocial_tab().click();
    }

    @Given("Find Download with a QR Code button")
    public void findDownloadWithAQRCodeButton() {
    }

    @Then("Find Download on the App Store button")
    public void findDownloadOnTheAppStoreButton() {
    }

    @And("Find GET IT ON Google Play button")
    public void findGETITONGooglePlayButton() {
    }

    @When("Click  GET IT ON Google Play button")
    public void clickGETITONGooglePlayButton() {
    }

    @Then("Check Log out option")
    public void checkLogOutOption() {
        homepage.getlog_out().isDisplayed();
    }

    @When("Click Log out option")
    public void clickLogOutOption() {
        homepage.getlog_out().click();
    }


    @Given("Check Share button is available")
    public void checkShareButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getshere().isDisplayed();
    }

    @When("Click Share button")
    public void clickShareButton() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getshere().click();
    }

    @Then("Check Share page is show in display")
    public void checkSharePageIsShowInDisplay() {
        homepage.getfacbook().isDisplayed();
    }


    @And("Share on Facebook option is available")
    public void shareOnFacebookOptionIsAvailable() {
        homepage.getfacbook().isDisplayed();
    }

    @And("hare on Twitter option is available")
    public void hareOnTwitterOptionIsAvailable() {
        homepage.gettwitter().isDisplayed();
    }

    @And("Link  is available")
    public void linkIsAvailable() {
    }

    @And("Check Cancel button is available")
    public void checkCancelButtonIsAvailable() {
        homepage.getcencel().isDisplayed();
    }

    @When("Click Cancel button")
    public void clickCancelButton() {
        homepage.getcencel().click();
    }

    @Then("Check NEWS tab available")
    public void checkNEWSTabAvailable() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getnews().isDisplayed();
    }

    @And("Check ENTERTAINMENT tab available")
    public void checkENTERTAINMENTTabAvailable() {
        homepage.getENTERTAINMENT().isDisplayed();
    }

    @And("Check TECHNOLOGY tab available")
    public void checkTECHNOLOGYTabAvailable() {
        homepage.getTechnology().isDisplayed();
    }


    @And("Check TRAVEL tab available")
    public void checkTRAVELTabAvailable() {
        homepage.getTravel().isDisplayed();
    }

    @And("Check FOOD tab available")
    public void checkFOODTabAvailable() {
        homepage.getFood().isDisplayed();
    }

    @And("Check SPORTS tab available")
    public void checkSPORTSTabAvailable() {
        homepage.getSports().isDisplayed();
    }

    @And("Check FLIPBOARD TV tab available")
    public void checkFLIPBOARDTVTabAvailable() {
        homepage.getFlipboard().isDisplayed();
    }
}




