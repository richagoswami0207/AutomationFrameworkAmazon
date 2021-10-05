package pageObjects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubscribeAndSavePage {


    private final String SUBSCRIBE_AND_SAVE= "//*[text()='Amazon Subscribe & Save']";
    private BaseUtil _base;


    public SubscribeAndSavePage(BaseUtil base) {
        _base= base;
    }

    public WebElement SubscribeAndSaveBanner(){
        return _base.Driver.findElement(By.xpath(SUBSCRIBE_AND_SAVE));
    }

    public Boolean SubscribeAndSaveBannerDisplayed(){
        return   _base.Driver.findElement(By.xpath(SUBSCRIBE_AND_SAVE)).isDisplayed();
    }
}
