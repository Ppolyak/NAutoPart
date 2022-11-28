package nautopart.tests;

import io.qameta.allure.Description;
import nautopart.model.User;
import nautopart.services.CheckoutFirstStepPageService;
import nautopart.services.CheckoutSecondStepService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutSecondStepTest extends BaseTest{

    private CheckoutSecondStepService checkoutSecondStepService;

    @BeforeClass
    public void setUp(){
        checkoutSecondStepService = new CheckoutSecondStepService();
    }

    @Test
    @Description("Checkout second step")
    public void secondStepTest(){
        User user = new User();
        String actualResult = checkoutSecondStepService
                .checkoutFinishButtuonClick(user)
                .getCompleteCheckoutText();
        String expectedResult = "THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(actualResult,expectedResult,"Wrong text");
    }

}
