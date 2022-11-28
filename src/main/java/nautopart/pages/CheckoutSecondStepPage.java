package nautopart.pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutSecondStepPage extends BasePage{

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public CheckoutSecondStepPage openPage(String url){
        driver.get(url);
        return this;
    }

    @Step
    @Description("Click finish button")
    public void clickFinishButton(){
        /*Actions actions = new Actions(driver);
        actions.contextClick(finishButton).perform();*/
        finishButton.click();
    }

    public boolean isFinishButton(){
        return finishButton.isDisplayed();
    }

}
