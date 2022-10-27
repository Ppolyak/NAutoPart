package nautopart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutFirstStepPage extends BasePage{

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipPostal;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public CheckoutFirstStepPage openPage(String url){
        driver.get(url);
        return this;
    }

    public CheckoutFirstStepPage fillFirstnameField(String userName){
        firstname.clear();
        firstname.sendKeys(userName);
        return this;
    }

    public CheckoutFirstStepPage fillLastnameField(String secondName){
        lastname.clear();
        lastname.sendKeys(secondName);
        return this;
    }

    public CheckoutFirstStepPage fillZipPostalField(String zipPostalCode){
        zipPostal.clear();
        zipPostal.sendKeys(zipPostalCode);
        return this;
    }

    public void clickContinueButton(){
        continueButton.click();
    }


}
