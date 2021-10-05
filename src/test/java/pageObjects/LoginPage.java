package pageObjects;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {

    public static final Logger log= LoggerFactory.getLogger(ProductDetailsPage.class);
    public static final String EMAIL=  "//*[@id= 'ap_email']";
    public static final String PASSWORD= "//*[@id='ap_password']";
    public static final String CONTINUE_BUTTON= "//*[@id='continue']";
    public static final String SIGN_IN_BUTTON= "//*[@id='signInSubmit']";



    BaseUtil _base;

    public LoginPage(BaseUtil base) {
        _base= base;
    }

    public WebElement emailInputBox(){
        return _base.Driver.findElement(By.xpath(EMAIL));
    }

    public WebElement passwordInputBox(){
        return _base.Driver.findElement(By.xpath(PASSWORD));
    }
    public WebElement continueBtn(){
        return _base.Driver.findElement(By.xpath(CONTINUE_BUTTON));
    }

    public WebElement signBtn(){
        return _base.Driver.findElement(By.xpath(SIGN_IN_BUTTON));
    }

    public void clickContinueBtn(){
        continueBtn().click();
    }

    public void clickSignInBtn(){
        signBtn().click();
    }

    public void enterEmailInlInput(String val){
        emailInputBox().sendKeys(val);
    }


    public void enterPwdInInput(String val){
        passwordInputBox().sendKeys(val);
    }
}
