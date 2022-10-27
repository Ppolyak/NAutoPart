package nautopart.services;

import nautopart.model.User;
import nautopart.pages.CheckoutCompletePage;
import nautopart.pages.CheckoutSecondStepPage;

public class CheckoutSecondStepService {

    private static final String CHECKOUT_SECOND_STEP_PAGE_URL = "https://www.saucedemo.com/checkout-step-two.html";

    protected CheckoutSecondStepPage checkoutSecondStepPage = new CheckoutSecondStepPage();
    protected LoginPageService loginPageService = new LoginPageService();

    public CheckoutCompletePage checkoutFinishButtuonClick(User user){
        loginPageService.login(user);
        checkoutSecondStepPage.openPage(CHECKOUT_SECOND_STEP_PAGE_URL)
                .clickFinishButton();
        return new CheckoutCompletePage();
    }
}

