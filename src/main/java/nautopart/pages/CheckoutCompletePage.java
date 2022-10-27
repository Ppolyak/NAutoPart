package nautopart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement completeCheckoutText;

    public String getCompleteCheckoutText(){
        return completeCheckoutText.getText();
    }

}
