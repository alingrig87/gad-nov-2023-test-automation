package tests;

import dataProviders.SignUpPageDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import tests.utils.SeleniumUtils;

public class SignUpPageTest extends BaseUITest {

    @Test(dataProvider = "signUpPageDataProvider", dataProviderClass = SignUpPageDataProvider.class)
    public void testIfSignUpPageIsAvailable(String browserType, boolean exceptedAvailability) {
        driver = SeleniumUtils.getDriver(browserType);

        SignUpPage signUpPage = new SignUpPage(driver);
        boolean isPageAvailable = signUpPage.open(pageUnderTestUrl);

        Assert.assertEquals(isPageAvailable, exceptedAvailability);
    }

}
