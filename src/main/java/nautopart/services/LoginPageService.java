package nautopart.services;

import nautopart.model.User;
import nautopart.pages.InventoryPage;
import nautopart.pages.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
    protected LoginPage loginPage = new LoginPage();

    public InventoryPage login(User user){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillUsernameField(user.getLogin())
                .fillPasswordField(user.getPassword())
                .clickOnLoginButton();
        return new InventoryPage();
    }

}
