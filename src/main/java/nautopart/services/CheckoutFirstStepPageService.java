package nautopart.services;

import lombok.extern.log4j.Log4j2;
import nautopart.model.User;
import nautopart.pages.CheckoutFirstStepPage;
import nautopart.pages.CheckoutSecondStepPage;

@Log4j2
public class CheckoutFirstStepPageService {

    private static final String CHECKOUT_FIRST_STEP_PAGE_URL = "https://www.saucedemo.com/checkout-step-one.html";

    protected CheckoutFirstStepPage checkoutFirstStepPage = new CheckoutFirstStepPage();

    protected LoginPageService loginPageService = new LoginPageService();

    public CheckoutSecondStepPage checkoutContinue(User user){
        log.info("Second Step started");
        loginPageService.login(user);
        checkoutFirstStepPage.openPage(CHECKOUT_FIRST_STEP_PAGE_URL)
                .fillFirstnameField(user.getFirstname())
                .fillLastnameField(user.getLastname())
                .fillZipPostalField(user.getZipPostal())
                .clickContinueButton();
        return new CheckoutSecondStepPage();
    }

}
