package nautopart.tests;

import io.qameta.allure.Description;
import nautopart.model.User;
import nautopart.services.CheckoutFirstStepPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutFirstStepTest extends BaseTest{

    private CheckoutFirstStepPageService checkoutFirstStepPageService;

    @BeforeClass
    public void setUp(){
        checkoutFirstStepPageService = new CheckoutFirstStepPageService();
    }

    @Test
    @Description("Checkout first step")
    public void checkoutFirstStepTest(){
        User user = new User();
        boolean actualContinueButton = checkoutFirstStepPageService.checkoutContinue(user)
                .isFinishButton();
        boolean expectedResult = true;
        Assert.assertTrue(actualContinueButton, "No button");/*
        Assert.assertEquals(actualContinueButton,expectedResult, "No button");*/
    }

}
