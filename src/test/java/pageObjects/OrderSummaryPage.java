package pageObjects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderSummaryPage {
    public static final Logger log= LoggerFactory.getLogger(OrderSummaryPage.class);
    public static final String SS_CHECKBOX=  "//*[@id= 'sns-item-checkbox-0']";
    public static final String ORDER_SUMMARY_AMOUNT= "//*[@id='subtotals-marketplace-table']/tbody/tr[8]/td[2]";



    BaseUtil _base;
    public OrderSummaryPage(BaseUtil base) {
        _base= base;
    }

    public WebElement subscriberAndSaveCheckbox(){
        return _base.Driver.findElement(By.xpath(SS_CHECKBOX));
    }

    public WebElement orderSummaryValue(){
        return _base.Driver.findElement(By.xpath(ORDER_SUMMARY_AMOUNT));
    }

    public boolean isSubscribeAndSaveCheckBoxChecked(){
    return subscriberAndSaveCheckbox().isSelected();
    }

    public String getOrderTotal(){
    return orderSummaryValue().getAttribute("innerHTML");
    }

}
