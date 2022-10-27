package nautopart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutSecondStepPage extends BasePage{

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public CheckoutSecondStepPage openPage(String url){
        driver.get(url);
        return this;
    }

    public void clickFinishButton(){
        finishButton.click();
    }

    public boolean isFinishButton(){
        return finishButton.isDisplayed();
    }

}
