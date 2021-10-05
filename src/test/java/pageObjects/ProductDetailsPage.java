package pageObjects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductDetailsPage {


    public static final Logger log= LoggerFactory.getLogger(ProductDetailsPage.class);
    public static final String DISCOUNT_5_PERCENT=  "//*[@class='discountTextLeft']";
    public static final String DISCOUNT_15_PERCENT= "//*[@class='discountTextRight']";
    public static final String PRODUCT_QUANTITY= "//*[@id='selectQuantity']";
    public static final String SET_UP_NOW_BUTTON= "rcx-subscribe-submit-button-announce";
    public static final String SUBSCRIBE_RADIO_BUTTON= "//*[@id='snsAccordionRowMiddle']/div/div[1]/a/i";

    BaseUtil _base;

    public ProductDetailsPage(BaseUtil base) {
        _base= base;
    }

    public WebElement fivePercentDiscountText(){
        return _base.Driver.findElement(By.xpath(DISCOUNT_5_PERCENT));
    }

    public WebElement tenPercentDiscountText(){
        return _base.Driver.findElement(By.xpath(DISCOUNT_15_PERCENT));
    }

    public WebElement setUpButton(){
        return _base.Driver.findElement(By.id(SET_UP_NOW_BUTTON));
    }

    public WebElement subscribeRadioButton(){
        return _base.Driver.findElement(By.xpath(SUBSCRIBE_RADIO_BUTTON));
    }


        public void checkIfFivePercentDiscountsIsDisplayed () {
        try {
             fivePercentDiscountText().isDisplayed();
        }catch (Exception e){
            System.out.println("disocunt is not displayed");
        }
    }
//
//        public boolean checkIfTenPercentDiscountsIsDisplayed () {
//        return tenPercentDiscountText().isDisplayed();
//    }




    public void clickSubscribeRadioButton(){
        try {
            subscribeRadioButton().click();
        }
        catch (Exception e){
            log.debug("Element could not be clicked {}", e);
            JavascriptExecutor executor = (JavascriptExecutor)_base.Driver;
            executor.executeScript("arguments[0].click();", subscribeRadioButton());
        }
    }

    public void clickSetUpNowButton(){
        try {
            setUpButton().click();
        }
        catch (Exception e){
            log.debug("Element could not be clicked {}", e);
//            JavascriptExecutor executor = (JavascriptExecutor)_base.Driver;
//            executor.executeScript("arguments[0].click();", subscribeRadioButton());
        }
    }


    public void isSubscribeRadioButtonSelected() {
        log.info("The radio button is displayed {}",  subscribeRadioButton().isDisplayed());
        log.info("The radio button is selected {}",  subscribeRadioButton().isSelected());
    }

}
