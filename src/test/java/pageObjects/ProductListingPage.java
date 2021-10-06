package pageObjects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProductListingPage {


    public static final Logger log = LoggerFactory.getLogger(pageObjects.AmazonHomepage.class);
      private static final String PRODUCT = "//div[@data-asin= 'B00VB1X6XU']";
    private BaseUtil _base;


    public ProductListingPage(BaseUtil base) {
        _base = base;
    }


    public WebElement getProduct() {
        return _base.Driver.findElement(By.xpath(PRODUCT));
    }

    public void selectProduct() {
        getProduct().click();
    }


    public void addProductFromTheList(){

        //   _base.Driver.findElement(By.xpath("//*[text()= 'Life Breakfast Cereal, Original, 13oz Boxes (3 Pack)']"));
        //  WebElement e=  _base.Driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
        List<WebElement> e= _base.Driver.findElements(By.xpath("//*[@data-component-type= 's-search-result']"));
        System.out.println("ELEMENTS :::::::::::::::::"+ e);
        System.out.println("LIST SIZE:::::::::::::::::::::::::::::::::::::::::::::::::::::::: :::::::::::::::::"+ e.size());
        e.get(10).click();
    }

    public void addNthProductFromTheList(String n){
        List<WebElement> e= _base.Driver.findElements(By.xpath("//*[@data-component-type= 's-search-result']"));
        System.out.println("ELEMENTS :::::::::::::::::"+ e);
        System.out.println("LIST SIZE:::::::::::::::::::::::::::::::::::::::::::::::::::::::: :::::::::::::::::"+ e.size());
        int val= Integer.parseInt(n);
        e.get(val).click();

    }

}
