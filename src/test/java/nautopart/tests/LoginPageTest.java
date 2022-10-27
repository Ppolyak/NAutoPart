package nautopart.tests;

import nautopart.model.User;
import nautopart.services.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest(){
        User user = new User();
        String actualText = loginPageService.login(user)
                .getTitleText();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(actualText, expectedText,
                "Actual text not compares with expected");
    }

}
