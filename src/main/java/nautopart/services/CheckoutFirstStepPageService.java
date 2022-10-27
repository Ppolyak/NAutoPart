package nautopart.services;

import nautopart.model.User;
import nautopart.pages.CheckoutFirstStepPage;
import nautopart.pages.CheckoutSecondStepPage;

public class CheckoutFirstStepPageService {

    private static final String CHECKOUT_FIRST_STEP_PAGE_URL = "https://www.saucedemo.com/checkout-step-one.html";

    protected CheckoutFirstStepPage checkoutFirstStepPage = new CheckoutFirstStepPage();

    protected LoginPageService loginPageService = new LoginPageService();

    public CheckoutSecondStepPage checkoutContinue(User user){
        loginPageService.login(user);
        checkoutFirstStepPage.openPage(CHECKOUT_FIRST_STEP_PAGE_URL)
                .fillFirstnameField(user.getFirstname())
                .fillLastnameField(user.getLastname())
                .fillZipPostalField(user.getZipPostal())
                .clickContinueButton();
        return new CheckoutSecondStepPage();
    }

}
