package pageObjects;

import Base.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonHomepage {



    public static final Logger log= LoggerFactory.getLogger(AmazonHomepage.class);
    public static final String TEXT_INPUT_BOX=".//*[@id= 'twotabsearchtextbox']";
    public static final String SEARCH_BUTTON= ".//*[@id= ' nav-search-submit-button']";
    private BaseUtil _base;

    public AmazonHomepage(BaseUtil base) {
        _base= base;
    }


    public WebElement inputBox(){
        return _base.Driver.findElement(By.xpath(TEXT_INPUT_BOX));
    }


    public WebElement searchButton(){
        return _base.Driver.findElement(By.xpath(SEARCH_BUTTON));
    }


    public void enterTextInInputBox(String s){
        log.info("Entering the text in Input box:::::::::::::" + s);
        inputBox().sendKeys(s);
    }

    public void verifyIfSubscriberAndSavePageisDisplayed(){
        Assert.assertEquals("https://www.amazon.com/", _base.Driver.getCurrentUrl());
    }


    public void clickOnSearchButton(){
        log.info("Entering the text in Input box:::::::::::::");
        inputBox().sendKeys(Keys.ENTER);

    }
}
