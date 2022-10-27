package nautopart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url){
        driver.get(url);
        return this;
    }

    public LoginPage fillUsernameField(String userName){
        username.clear();
        username.sendKeys(userName);
        return this;
    }

    public LoginPage fillPasswordField(String keyPassword){
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
