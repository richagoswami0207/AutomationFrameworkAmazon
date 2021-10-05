package stepDefinition;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.*;

public class AmazonSubscribeAndSaveStepsDisplaySteps extends BaseUtil {

    public static final Logger log= LoggerFactory.getLogger(AmazonSubscribeAndSaveStepsDisplaySteps.class);
    private BaseUtil _base;

    // Dependency Injection to get the WebDriver initialized using pico container//
    public AmazonSubscribeAndSaveStepsDisplaySteps(BaseUtil base) {
        _base= base;
        log.info("Base Class" + base);
        log.info("Initializing the driver from the constructor!!!");
    }

    @Given("I open the browser")
    public void i_open_the_browser() {
        log.info("Opening the browser!!!");

    }

    @When("I enter url {string} in the browser")
    public void iEnterUrlInTheBrowser(String url) {
        _base.Driver.navigate().to(url);
    }

    @Then("The amazon home page is displayed")
    public void theAmazonHomePageIsDisplayed() {
        AmazonHomepage home = new AmazonHomepage(_base);
        home.verifyIfSubscriberAndSavePageisDisplayed();
    }

    @And("I enter text {string} in the input box and click Enter")
    public void iEnterTextInTheInputBoxAndClickEnter(String s) {
        AmazonHomepage home = new AmazonHomepage(_base);
        home.enterTextInInputBox(s);
        home.clickOnSearchButton();
    }

    @Then("the {string} banner is displayed")
    public void theBannerIsDisplayed(String textMessaging) {
        SubscribeAndSavePage subscribeAndSave= new SubscribeAndSavePage(_base);
        Assert.assertTrue(subscribeAndSave.SubscribeAndSaveBannerDisplayed());
        log.info("The Subscribe and Save banner shows as expected!");
    }


    @And("I select eligible product from the listing")
    public void iSelecteligibleProductFromTheListing() {
        ProductListingPage listingPage = new ProductListingPage(_base);
        listingPage.selectProduct();
        log.debug("found the product and successfully clicked!!");
    }

    @Then("the discounts are displayed on product detail page")
    public void theAndDiscountsAreDisplayedOnProductDetailPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(_base);
        productDetailsPage.checkIfFivePercentDiscountsIsDisplayed();
        //   productDetailsPage.checkIfTenPercentDiscountsIsDisplayed();
        log.info("Discounts are verified on the Product details page");
    }


    @And("I add one product from the list")
    public void iAddOneProductFromTheList() {
        ProductListingPage listing = new ProductListingPage(_base);
        listing.addProductFromTheList();
        log.info("Product added from the list!!!");
    }


    @Then("I click {string} radio button product details page")
    public void iClickRadioButtonProductDetailsPage(String arg0) {
        ProductDetailsPage detailsPage= new ProductDetailsPage(_base);
        detailsPage.clickSubscribeRadioButton();
        detailsPage.isSubscribeRadioButtonSelected();
    }


    @And("I click {string} button on product details page")
    public void iClickButtonOnProductDetailsPage(String btn) {
        ProductDetailsPage detailsPage= new ProductDetailsPage(_base);
        detailsPage.clickSetUpNowButton();
    }

    @And("I Login using Email {string} and click Continue")
    public void iLoginUsingEmailAsAndClickContinue(String email) {
        LoginPage l= new LoginPage(_base);
        l.enterEmailInlInput(email);
        l.clickContinueBtn();
    }

    @And("I Login using Password {string} and click SignIn")
    public void iLoginUsingPasswordAsAndClickSignIn(String pwd) {
        LoginPage l= new LoginPage(_base);
        l.enterPwdInInput(pwd);
        l.clickSignInBtn();
    }


    @Then("the Subscribe and Save checkbox is checked and Order Total is displayed")
    public void theSubscribeAndSaveCheckboxIsCheckedAndOrderTotalIsDisplayed() {
        OrderSummaryPage orderSummaryPage= new OrderSummaryPage(_base);
        Assert.assertTrue(orderSummaryPage.isSubscribeAndSaveCheckBoxChecked());
        log.info("Checkbox is check");
        log.info("Order total is displayed");

    }

    ;

}

